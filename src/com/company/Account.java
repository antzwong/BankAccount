package com.company;

public class Account {
    //account will initiallly have 0 dollars
    //have account types where there are limits on withdrawls

    private Integer accountID;
    private double balance;
    private double withdrawLimit;
    private boolean accountType; //true = checkings
    private String nickname; //nickname of the account

    public Account(Integer accountID) {
        this.accountID = accountID;
        this.balance = 0;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    String getNickname() {
        return nickname;
    }



    void printAccountInfo() {
        System.out.println(getAccountID() + "- " + getAccountType() + " \n" + "Balance: $" + getBalance() + "\n");
    }

    double getWithdrawLimit() {
        return withdrawLimit;
    }

    void setWithdrawLimit(double withdrawLimit) { this.withdrawLimit = withdrawLimit; }


    int getAccountID() {
        return accountID;
    }


    void setAccountType(boolean type) {
        this.accountType = type;
    }


    private String getAccountType() {
        if (accountType) {
            return "Checking";
        }

        return "Savings";
    }

    double getBalance() {
        return balance;
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






}
