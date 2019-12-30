package com.company;

public class SavingsAccount extends Account {
    public SavingsAccount(int accountID) {
        super(accountID);
        this.setWithdrawLimit(500);
    }

    public SavingsAccount() {
    }

    @Override
    void setWithdrawLimit(double amount) {
        System.out.println("Cannot change withdraw limit for a savings account");
    }
}
