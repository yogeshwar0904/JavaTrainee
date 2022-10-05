package com.ideas2it.model;

/**
 * The admin get request from user
 * validate the request.
 *
 * @version    1.0 sept 13 2022
 * @author     Yogeshwar
 */
public class AdminAccount {
    private String accountName;
    private String password;

    public FollowerAccount(String accountName, String password) {
        this.accountName = accountName;
        this.password = password;
    }
       
    public String getAccountName() {
        return acountName;
    }

    public void setAccountName(String accountName) { 
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String accountName) { 
        this.password = password;
    }

    public String toString() {
        return "Account Name = " + getAccountName();
    }
}