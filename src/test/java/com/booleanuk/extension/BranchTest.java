package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

public class BranchTest {

    private Branch generateBranch(){
        Branch branch = new Branch(new ArrayList<Account>(), new ArrayList<Request>());
        branch.addAccount(new Account(new ArrayList<Transaction>(), UUID.randomUUID().toString(), 0));
        return branch;
    }

    @Test
    public void testCreateRequest(){
        Branch branch = generateBranch();
        Account acc = branch.getAccounts().get(0);
        branch.createRequest(acc, 2000);
        Assertions.assertEquals(1, branch.getRequests().size());
    }

    @Test
    public void testAcceptRequest(){
        Branch branch = generateBranch();
        Account acc = branch.getAccounts().get(0);
        branch.createRequest(acc, 2000);
        Request req = branch.getRequests().get(0);

        branch.acceptRequest(req);

        Assertions.assertEquals(2000, acc.getOverdraft());
    }

    @Test
    public void testDenyRequest(){
        Branch branch = generateBranch();
        Account acc = branch.getAccounts().get(0);
        branch.createRequest(acc, 2000);
        Request req = branch.getRequests().getFirst();

        branch.denyRequest(req);

        Assertions.assertEquals(0, acc.getOverdraft());
    }

    @Test
    public void testOverDraft(){
        Branch branch = generateBranch();
        Account acc = branch.getAccounts().getFirst();
        branch.createRequest(acc, 2000);
        Request req = branch.getRequests().getFirst();
        branch.acceptRequest(req);

        Assertions.assertDoesNotThrow(() -> acc.withdraw(1500));
    }

}
