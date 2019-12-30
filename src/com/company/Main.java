package com.company;

public class Main {

	public static void main(String[] args) {
	    User a = new User("John", "Smith", 1);
	    a.createCheckingsAccount();
	    a.createSavingsAccount();
	    a.getAccount(1).deposit(100);

	    //a.getAccount(1).setNickname("Test1");
	    //System.out.println(a.getAccount(1).getNickname());

	    System.out.println(a.getAccount(1).getWithdrawLimit());
	    System.out.println(a.getAccount(1).getAccountID());

	    User b = new User("Jane", "Smith", 2);

    }
}
