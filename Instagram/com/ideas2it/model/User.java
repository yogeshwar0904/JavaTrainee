package com.ideas2it.model;

/**
 * Create the account for new user,to
 * post their picture,to feed their memories
 * in their stories to get commends and likes.
 *
 * @version     1.0 13 Sept 2022
 * @author      Yogeshwar
 */
public class User {
    private String accountName;
    private String firstName;
    private String lastName;
    private long mobileNumber;
    private String password;
  
    public User() {}

    public UserProfile(String firstName, String lastName,
                       String mobileNumber, String createPassword,
                       String password) {
        this.accountName = accountName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;   
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;   
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getMobileNumber() {
        return mobileNumber;   
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCreatePassword() {
        return password;
    }
 
    public void setCreatePassword(String createPassword) {
        this.password = password;
    }

    public String getAccountName() {
        return accountName;    
    } 
   
    public void setAccountName(String name) {
        this.accountName = name;
    }  

    public String toString() {
        StringBuilder showResult = new StringBuilder();
        showResult.append("\nAccount Name = ").append(getFirstName())
                  .append("\nFirst Name = ").append(getLastName())
                  .append("\nLast Name = ").append(getLastName())
                  .append("\nMobile Number= ").append(getAccountName());
        return showResult.toString();
    }
}