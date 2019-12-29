package com.company;

public class SavingsAccount extends Account {
    public SavingsAccount(int accountID) {
        super(accountID);
        this.setWithdrawLimit(500);
    }
}
