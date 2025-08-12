package com.booleanuk.core;

import java.util.List;

public class SavingsAccount extends Account{
    public SavingsAccount(List<Transaction> ledger, String id, float balance){
        super(ledger, id, balance);
    }
}
