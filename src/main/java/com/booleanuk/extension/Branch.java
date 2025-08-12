package com.booleanuk.extension;

import java.util.List;

public class Branch {
    private List<Account> accounts;
    private List<Request> requests;

    public Branch(List<Account> accounts, List<Request> requests){

        this.accounts = accounts;
        this.requests = requests;
    }

    public void createRequest(Account acc, float overdraft){
        Request req = new Request(acc, overdraft);
        this.getRequests().add(req);
    }

    public void acceptRequest(Request req){
        req.getAcc().setOverdraft(req.getOverdraft());
        req.getAcc().getOverdraft();
        requests.remove(req);
    }

    public void denyRequest(Request req){
        requests.remove(req);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account acc){
        this.accounts.add(acc);
    }

    public List<Request> getRequests() {
        return requests;
    }
}
