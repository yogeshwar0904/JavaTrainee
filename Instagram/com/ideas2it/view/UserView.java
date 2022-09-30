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
        StringBuilder userMessage = new StringBuilder();   
        int choice;
        String backToMenu = "";
        do {
            userMessage.append(" Enter 1 for add User"); 
            userMessage.append("\n Enter 2 for remove user");
            userMessage.append("\n Enter 3 for display the user");
            userMessage.append("\n Enter 4 for update the User");
            userMessage.append("\n Enter 5 for search ");
            System.out.println(userMessage);
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
            userMessage.delete(0, userMessage.length() - 1);
            System.out.println("Enter Y for continue");
            System.out.println("Enter N for Exit");
            backToMenu = scanner.next();
        } while (backToMenu.equalsIgnoreCase("Y")); 
    }

    /**
     * creates the multiple account 
     */   
    public void add() {
         
        do {
            System.out.println("Create the Account Name");
            String accountName = scanner.nextLine();
        } while (!instagramController.isValidAccountName(accountName));

        do {
            System.out.println("Enter the FirstName");
            String firstName = scanner.nextLine();
           } while (!instagramController.isValidName(firstName));

        do {
            System.out.println("Enter the LastName");
            String lastName = scanner.nextLine();
        } while (!instagramController.isValidName(lastName));

        do {
            System.out.println("Enter the Mobile Number");
            long mobileNumber = scanner.nextLong();
        } while (!instagramController.isValidMobileNumber(mobileNumber.toString())); 
        scanner.skip("\r\n");
      
        do {
            System.out.println("Create the Password");
            String createPassword = scanner.nextLine(); 
        } while (instagramController.!isValidPassword(Createpassword)); 
 
        User user = new User(firstName, lastName, mobileNumber, createPassword, 
                              accountName);
        System.out.println(" Account Profile details\n" + instagramController
                             .add(accountName, user));    
    }

    /**
     * remove the Account    
     */
    public void deleteAccount() {
        System.out.println("Enter the account name you want to remove");
        String accountName = scanner.nextLine();
        System.out.println("Enter the password of your account");
        String createPassword = scanner.nextLine();
        System.out.println(instagramController.deleteAccount(accountName, createPassword));
    }
      
    /**
     * search the Account    
     */
    public void search() {
        System.out.println("Enter the account name you want to search");
        String accountName = scanner.nextLine();

        if (instagramController.search(accountName) == null) {
            System.out.println("No account found");
        } else {
            System.out.println(instagramController.search(accountName));   
        } 
    }

    /**
     * display the Account
     */
    public void display() {
        System.out.println(instagramController.display().values());
    }

    /**
     * update the Account    
     */
    public void update() {
        StringBuilder userMessage = new StringBuilder();
        int choice;
        String backToUpdate = "";
        System.out.println("enter account name to update");
        String accountName = scanner.next();
        User user = null; 
        userMessage.append(" Enter 1 for update account name")
                   .append("\n Enter 2 for update first name")
                   .append("\n Enter 3 for update last name")
                   .append("\n Enter 4 for update mobile number")
                   .append("\n Enter 5 for update password")
                   .append("\n Enter 6 to Exit");
        System.out.println(userMessage);
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
            userMessage.delete(0, userMessage.length() - 1);
            userMessage.append("Entered value is Invalid!! ")
                       .append("\n enter correct option to update");
            System.out.println(userMessage);
            break;
       }
       userMessage.delete(0, userMessage.length() - 1);  

       if(user == null) {
           System.out.println("User id is not valid");
       } else {
           System.out.println(user + "\nAccount Updated successfully");
       }
    }
}    