package com.company;

public class Main {

	public static void main(String[] args) {
	    User a = new User("JSmith", "password", 1, "John", "Smith");
	    a.createCheckingsAccount();
	    a.createSavingsAccount();
	    a.getAccount(1).deposit(100);

	    System.out.println(a.getAccount(1).getWithdrawLimit());
	    System.out.println(a.getAccount(1).getAccountID());


    }
}
