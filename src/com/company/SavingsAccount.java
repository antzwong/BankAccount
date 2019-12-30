package com.company;

public class SavingsAccount extends Account {
    private final int withdrawLimit;

    public SavingsAccount(int accountID) {
        super(accountID);
        this.withdrawLimit = 500;
    }


    @Override
    void setWithdrawLimit(double amount) {
        System.out.println("Cannot change withdraw limit for a savings account");
    }
}
