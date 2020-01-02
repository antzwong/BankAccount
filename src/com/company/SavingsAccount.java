package com.company;

public class SavingsAccount extends Account {

    public SavingsAccount(Integer accountID) {
        super(accountID);
        super.setWithdrawLimit(500);
    }


    void setWithdrawLimit(double amount) {
        System.out.println("Cannot change withdraw limit for a savings account");
    }
}
