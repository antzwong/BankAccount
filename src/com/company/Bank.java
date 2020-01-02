package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private ArrayList<User> users;

    public Bank() {

    }



    void addUser(String username, String password, Integer SSN, String firstName, String lastName) {
        if (userExists(SSN, username)) {
            return;
        } else {
            User temp = createUser(username, password, SSN, firstName, lastName);
            users.add(temp);
            System.out.println("Succuessfully added " + username);
        }

    }

    User createUser(String username, String password, Integer SSN, String firstName, String lastName) {
        return new User(username, password, SSN, firstName, lastName);
    }


    //technical question. would it be easier to have one method test both SSN and uername or two seperate methods

    private boolean userExists(Integer SSN, String username) {
        for (User i : users) {
            if (Objects.equals(i.getSSN(), SSN)) {
                System.out.println("User already exists");
                return true;
            }

            if (Objects.equals(i.getUsername(), username)) {
                System.out.println("Username already taken");
                return true;
            }
        }

        return false;
    }



    User login(String username, String password) {
        for (User i : users) {
            if (i.getUsername().equals(username) && i.getPassword().equals(password)) {
                return i;
            }
        }

        System.out.println("Username or password is incorrect");
        return null; //need to set it up so that the user can log in again
    }

}
