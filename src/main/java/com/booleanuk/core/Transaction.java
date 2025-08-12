package com.booleanuk.core;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {
    float deltaBalance;
    LocalDate timeStamp;

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
