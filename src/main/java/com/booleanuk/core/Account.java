package com.booleanuk.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Account {
    List<Transaction> ledger;
    String id;
    float balance;

    public Account(List<Transaction> ledger, String id, float balance){
        this.ledger = ledger;
        this. id = id;
        this.balance = balance;
    }

    public String getTransactionHistory(){
        List<Transaction> transactions = new ArrayList<>(ledger); //Clone list to not affect attribute



        List<String> rows = new ArrayList<>();

        float balance = 0;
        for(Transaction tr : transactions){
            balance += tr.deltaBalance;
            StringBuilder sb = new StringBuilder();
            String dateStr = tr.getTimeStamp().format(DateTimeFormatter.ofPattern("dd/MM/uuuu"));
            sb.append(String.format("%-11s||", dateStr));
            if(tr.getDeltaBalance()>0){
                sb.append(String.format(" %-8.2f||", tr.getDeltaBalance()));
                sb.append(String.format(" %-7s||" ,""));
            } else {
                sb.append(String.format(" %-8s||" ,""));
                sb.append(String.format(" %-7.2f||", -tr.getDeltaBalance()));
            }
            sb.append(String.format(" %.2f", balance));
            sb.append("\n");
            rows.add(sb.toString());
        }
        rows.add("date       || credit  || debit  || balance\n");
        String ret = rows.reversed().stream().reduce("", ( (acc,curr) -> acc+curr));
        return ret;
    }

    public float deposit(float val){
        this.setBalance(this.getBalance()+val);

        this.addLedgerEntry(val);

        return this.getBalance();
    }

    public float withdraw(float amount) throws InsufficientFundsException{
        if(amount > this.getBalance()){
            throw new InsufficientFundsException();
        } else {
            this.setBalance(this.getBalance()-amount);

            this.addLedgerEntry(-amount);

            return this.getBalance();
        }

    }

    private void addLedgerEntry(float val){
        Transaction transaction = new Transaction(val, LocalDate.now());
        ledger.add(transaction);
    }

    public List<Transaction> getLedger() {
        return ledger;
    }

    public void setLedger(List<Transaction> ledger) {
        this.ledger = ledger;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
