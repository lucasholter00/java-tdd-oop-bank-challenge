package com.booleanuk.core;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AccountTest {
    float delta = 0.0001f;

    private Account generateAccount(){
        return new Account(new ArrayList<Transaction>(), UUID.randomUUID().toString(), 0);
    }



    @Test
    public void testDeposit(){
        Account acc = generateAccount();

        Assertions.assertEquals(0, acc.getBalance(), delta);
        float testInsert = 100f;
        Assertions.assertEquals(testInsert, acc.deposit(testInsert), delta);
        Assertions.assertEquals(testInsert, acc.getBalance());
    }

    @Test
    public void testTransactionGeneration(){
        Account acc = generateAccount();

        acc.deposit(10);
        try{
            acc.withdraw(5);
        } catch(InsufficientFundsException e){
            Assertions.fail("Withdraw threw exception");
        }

        Assertions.assertEquals(2, acc.getLedger().size());
    }

    @Test
    public void testWithdrawValid(){
        Account acc = generateAccount();

        Assertions.assertEquals(0, acc.getBalance(), delta);
        float testInsert = 150f;
        float testWithdraw = 100f;
        acc.deposit(testInsert);
        try {
            Assertions.assertEquals(testInsert - testWithdraw, acc.withdraw(testWithdraw), delta);
        } catch(InsufficientFundsException e){
            Assertions.fail("Withdraw threw exception");
        }
        Assertions.assertEquals(testInsert-testWithdraw, acc.getBalance());
    }

    @Test
    public void testWithDrawMoreThanBalance(){
        Account acc = generateAccount();
        acc.deposit(50);

        Assertions.assertThrows(InsufficientFundsException.class ,() -> acc.withdraw(100));
    }

}
