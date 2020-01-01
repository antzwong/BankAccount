package com.company;


public class CheckingsAccount extends Account {

    public CheckingsAccount(int accountID) {
        super(accountID);
    }


    void setWithdrawLimit(double amount) {
        super.setWithdrawLimit(amount);
        System.out.println("Your withdraw limit for this account is now $" + amount);
    }

}
