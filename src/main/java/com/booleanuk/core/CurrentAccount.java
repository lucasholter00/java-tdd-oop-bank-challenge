package com.booleanuk.core;

import java.util.List;

public class CurrentAccount extends Account{
    public CurrentAccount(List<Transaction> ledger, String id, float balance){
        super(ledger, id, balance);
    }
}
