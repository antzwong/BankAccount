package com.company;

import java.util.ArrayList;


public class User {
    private String firstName;
    private String lastName;
    private int SSN;
    private ArrayList<Account> accounts; //user does not need to have a bank account


    public User (String firstName, String lastName, int SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.accounts = new ArrayList<Account>();
    }

    public String getUserName() {
        return firstName + " " + lastName;
    }

    public int getUserSSN() {
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
        Account temp = new Account(newID);
        temp.setAccountType(false);
        accounts.add(temp);
    }

    void createCheckingsAccount() {
        int newID = generateAccountID();
        Account temp = new Account(newID);
        temp.setAccountType(true);
        accounts.add(temp);
    }

    private int generateAccountID() {
        return accounts.size();
    }

}
