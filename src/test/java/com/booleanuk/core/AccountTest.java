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
        Account account = new Account(new ArrayList<Transaction> ledger, UUID.randomUUID(), 0);
    }



    @Test
    public void testDeposit(){
        Account acc = generateAccount();

        Assertions.assertEquals(0, acc.getBalance(), delta);
        float testInsert = 100f;
        Assertions.assertEquals(testInsert, acc.deposit(testInsert), delta);
        Assertions.assertEquals(testInsert, acc.getBalance());
    }

    public void testTransactionGeneration(){
        Account acc = generateAccount();

        acc.deposit(10);
        acc.withdraw(5);

        Assertions.assertEquals(2, acc.getLedger().size());
    }

    @Test
    public void testWithdrawValid(){
        Account acc = generateAccount();

        Assertions.assertEquals(0, acc.getBalance(), delta);
        float testInsert = 150f;
        flot testWithdraw = 100f;
        acc.deposit(testInsert);
        Assertions.assertEquals(testInsert-testWithdraw, acc.withdraw(testWithdraw), delta);
        Assertions.assertEquals(testInsert-testWithdraw, acc.getBalance());
    }

    @Test
    public void testWithDrawMoreThanBalance(){
        Account acc = generateAccount();
        acc.deposit(50);

        Assertions.assertThrows(acc.withdraw(100));
    }

}
