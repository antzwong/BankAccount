package com.company;

import java.util.ArrayList;


public class User {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Integer SSN;
    private ArrayList<Account> accounts; //user does not need to have a bank account


    public User (String username, String password, Integer SSN, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.accounts = new ArrayList<Account>();
    }


    String getPassword() {
        return password;
    }

    String getUsername() {
        return username;
    }

    void setUsername(String username) {
        this.username = username;
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getfullName() {
        return firstName + " " + lastName;
    }

    Integer getSSN() {
        return SSN;
    }

    public void printAccounts() {
        for (Account i : accounts) {
            i.printAccountInfo();
        }
    }



    Account getAccount(int accountID) {
        for (Account i : accounts) {
            if(i.getAccountID() == accountID) {
                return i;
            }
        }

        System.out.println("That is not a valid account ID");
        return null;

    }

    void createSavingsAccount() {
        int newID = generateAccountID();
        Account temp = new SavingsAccount(newID);
        temp.setAccountType(false);
        //temp.setWithdrawLimit(500.00);
        accounts.add(temp);
    }

    void createCheckingsAccount() {
        int newID = generateAccountID();
        Account temp = new CheckingsAccount(newID);
        temp.setAccountType(true);
        accounts.add(temp);
    }

    private Integer generateAccountID() {
        return accounts.size();
    }

}
