package com.company;

public class Main {

	public static void main(String[] args) {
	    User a = new User("John", "Smith", 1);
	    a.createCheckingsAccount();
	    a.createSavingsAccount();
	    System.out.println(a.getAccount(1).getAccountType());
	    System.out.println(a.getAccount(1).getWithdrawLimit());
	    User b = new User("Jane", "Smith", 2);

    }
}
