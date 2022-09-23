package com.ideas2it.model;

/**
 * Create the account for new user,to
 * post their picture,to feed their memories
 * in their stories to get commends and likes.
 *
 * @version     1.0 13 Sept 2022
 * @author      Yogeshwar
 */
public class UserProfile {
    private String firstName;
    private String lastName;
    private long mobileNumber;
    private String createPassword;
    private String accountName;
  
    public UserProfile() {}

    public UserProfile(String firstName, String lastName,
                          long mobileNumber, String createPassword,
                          String accountName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.createPassword = createPassword;
        this.accountName = accountName;
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
        return createPassword;
    }
 
    public void setCreatePassword(String createPassword) {
        this.createPassword = createPassword;
    }

    public String getAccountName() {
        return accountName;    
    } 
   
    public void setAccountName(String name) {
        this.accountName = name;
    }  

    public String toString() {
        return "__________________________________" + "\n"
            + "First name ="  + getFirstName() + "\n"
            + "Last name = "  + getLastName() + "\n"
            + "Mobile Number = " + getMobileNumber() + "\n"
            + "Account Name = " + getAccountName() 
            + "\n______________________________________";
    }
}