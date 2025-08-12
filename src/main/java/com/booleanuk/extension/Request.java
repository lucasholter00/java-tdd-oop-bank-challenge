package com.booleanuk.extension;

public class Request {
    private Account acc;
    private float overdraft;

    public Request(Account acc, float overdraft){
        this.acc = acc;
        this.overdraft = overdraft;
    }

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    public float getOverdraft() {
        return this.overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }
}
