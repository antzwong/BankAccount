package com.company;

public class Account {
    //account will initiallly have 0 dollars
    //have account types where there are limits on withdrawls

    private int accountID;
    private double balance;
    private double withdrawLimit;
    private boolean accountType; //true = checkings
    private String nickname; //nickname of the account

    public Account(int accountID) {
        this.accountID = accountID;
        this.balance = 0;
    }

    void getAccountInfo() {

    }

    void printAccountInfo() {
        System.out.println(getAccountID() + "- " + getAccountType() + " \n" + "Balance: $" + getBalance() + "\n");
    }

    public int getAccountID() {
        return accountID;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (validWithdrawl(amount)) {
            balance -= amount;
        } else {
            System.out.println("Cannot withdraw into a deficit");
        }
    }

    double getBalance() {
        return balance;
    }

    public void setAccountNickname(String nickname) {
        this.nickname = nickname;
    }

    void setAccountType(boolean type) {
        this.accountType = type;
    }

    void setWithdrawLimit(double amount) {
        this.withdrawLimit = amount;
        System.out.println("Your withdraw limit for this account is now " + amount);
    }

    private boolean validWithdrawl(double amount) {
        return sufficientFunds(amount) && belowWithdrawLimit(amount);
    }

    //construct account so that withdraw limit is defaulted to max funds unless its a savings account
    private boolean belowWithdrawLimit(double amount) {
        if(amount <= withdrawLimit) {
            return true;
        }
        System.out.println("requested withdraw is above your withdraw limit");
        return false;
    }

    private boolean sufficientFunds(double amount) {
        if(getBalance() > amount) {
            return true;
        }
        System.out.println("insufficient funds");
        return false;
    }

    String getAccountType() {
        if (accountType) {
            return "Checking";
        }

        return "Savings";
    }




}
