package com.booleanuk.extension;

import java.time.LocalDate;

public class Transaction {
    private float deltaBalance;
    private LocalDate timeStamp;

    public Transaction(float deltaBalance ,LocalDate timeStamp){
        this.deltaBalance = deltaBalance;
        this.timeStamp = timeStamp;
    }

    public float getDeltaBalance() {
        return deltaBalance;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setDeltaBalance(float deltaBalance) {
        this.deltaBalance = deltaBalance;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }
}
