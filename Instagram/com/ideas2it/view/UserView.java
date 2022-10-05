package com.ideas2it.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.ideas2it.constant.Constant;
import com.ideas2it.controller.InstagramController;
import com.ideas2it.model.User;

/**
 * Getting the values from the user for create an
 * new account.
 *
 * @version     1.0 14 Sept 2022
 * @author      Yogeshwar
 */ 
public class UserView {
    private InstagramController instagramController;
    private Scanner scanner;
  
    public UserView() {
        this.instagramController = new InstagramController();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Get the sugestion from the user based
     * on their choice.
     */ 
    public void userInput() {
        StringBuilder showStatement = new StringBuilder();   
        int choice;
        String backToMenu = "";
        do {
            showStatement.append(" Enter 1 for add user") 
                         .append("\n Enter 2 for remove user")
                         .append("\n Enter 3 for display the user")
                         .append("\n Enter 4 for update the user")
                         .append("\n Enter 5 for search ");
            System.out.println(showStatement);
            choice = scanner.nextInt();
            scanner.skip("\r\n");

            switch (choice) {
            case Constant.ADD:
                add();
                break;

            case Constant.REMOVE:
                deleteAccount();
                break;

            case Constant.DISPLAY:
                display();
                break;

            case Constant.UPDATE:
                update();
                break;

            case Constant.SEARCH:
                search();
                break;

            default:
                System.out.println("Entered value is Invalid!!");
                break;
            }
            showStatement.delete(0, showStatement.length() - 1);
            System.out.println("Enter Y for continue");
            System.out.println("Enter N for Exit");
            backToMenu = scanner.next();
        } while (backToMenu.equalsIgnoreCase("Y")); 
    }

    /**
     * creates the multiple account 
     */   
    private void add() {
        String firstName;
        String lastName; 
        String accountName; 
        String password;
        long mobileNumber;
         
        do {
            System.out.println("Create the Account Name");
            accountName = scanner.nextLine();
            if (!instagramController.isValidAccountName(accountName)) {
                System.out.println("Entered wrong formate try again");
            }
        } while (!instagramController.isValidAccountName(accountName));

        do {
            System.out.println("Enter the FirstName");
            firstName = scanner.nextLine();
            if (!instagramController.isValidName(firstName)) {
                System.out.println("Entered wrong formate try again");
            } 
        } while (!instagramController.isValidName(firstName));

        do {
            System.out.println("Enter the LastName");
            lastname = scanner.nextLine();
            if (!instagramController.isValidName(lastName)) {
                System.out.println("Entered wrong formate try again");
            } 
        } while (!instagramController.isValidName(lastName));

        do {
            System.out.println("Enter the Mobile Number");
            mobileNumber = scanner.nextLong();
            if (!instagramController.isValidMobileNumber(mobileNumber)) {
                System.out.println("Entered wrong formate try again");
            } 
        } while (!instagramController.isValidMobileNumber(mobileNumber)); 
        scanner.skip("\r\n");
      
        do {
            System.out.println("Create the Password");
            password = scanner.nextLine();
            if (!instagramController.isValidPassword(password)) {
                System.out.println("Entered wrong formate try again");
            } 
        } while (!instagramController.isValidPassword(password)); 
        instagramController.add(accountName, firstName, lastName, mobileNumber, password);
        System.out.println(" Account created sucessfully ");    
    }

    /**
     * remove the Account    
     */
    private void deleteAccount() {
        System.out.println("Enter the account name you want to remove");
        String accountName = scanner.nextLine();
        System.out.println("Enter the password of your account");
        String password = scanner.nextLine();
        System.out.println(instagramController.deleteAccount(accountName, password));
    }
      
    /**
     * search the Account    
     */
    private void search() {
        System.out.println("Enter the account name you want to search");
        String accountName = scanner.nextLine();

        if (null == instagramController.search(accountName)) {
            System.out.println("No account found");
        } else {
            System.out.println(instagramController.search(accountName));   
        } 
    }

    /**
     * display the Account
     */
    private void display() {
        System.out.println(instagramController.display().values());
    }

    /**
     * update the Account    
     */
    private void update() {
        User user = new User();
        StringBuilder showStatement = new StringBuilder();
        int choice;
        String backToUpdate = "";
        System.out.println("enter account name to update");
        String accountName = scanner.next();
        showStatement.append(" Enter 1 for update account name")
                   .append("\n Enter 2 for update first name")
                   .append("\n Enter 3 for update last name")
                   .append("\n Enter 4 for update mobile number")
                   .append("\n Enter 5 for update password")
                   .append("\n Enter 6 to Exit");
        System.out.println(showStatement);
        choice = scanner.nextInt();
        scanner.skip("\r\n");     

        switch (choice) {
        case Constant.UPDATEACCOUNTNAME:
            System.out.println("enter account name to update");
            String updateAccountName = scanner.nextLine();
            user = instagramController.update(accountName, updateAccountName,
                                              Constant.UPDATEACCOUNTNAME);
            break;

        case Constant.UPDATEFIRSTNAME:
            System.out.println("Enter first name to update");
            String updateFirstName = scanner.next();
            user = instagramController.update(accountName, updateFirstName,
                                              Constant.UPDATEFIRSTNAME);
            break;

        case Constant.UPDATELASTNAME:
            System.out.println("enter last name to update");
            String updateLastName = scanner.next();
            user = instagramController.update(accountName, updateLastName,
                                              Constant.UPDATELASTNAME);
            break;

        case Constant.UPDATEMOBILENUMBER:
            System.out.println("enter mobile number to update");
            long mobileNumber = scanner.nextLong();
            String updateMobileNumber = String.valueOf(mobileNumber);
            user = instagramController.update(accountName, updateMobileNumber,
                                              Constant.UPDATEMOBILENUMBER);
            break;

        case Constant.UPDATEPASSWORD:
            System.out.println("enter password to update");
            String updatePassword = scanner.next();
            user = instagramController.update(accountName, updatePassword,
                                              Constant.UPDATEPASSWORD);
            break;

        case Constant.EXIT:
            break;

        default:
            showStatement.delete(0, showStatement.length() - 1);
            showStatement.append("Entered value is Invalid!! ")
                         .append("\n enter correct option to update");
            System.out.println(showStatement);
            break;
       }
       showStatement.delete(0, showStatement.length() - 1);  

       if(null == user) {
           System.out.println("User id is not valid");
       } else {
           System.out.println(user + "\nAccount Updated successfully");
       }
    }
}    