package com.ideas2it.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.ideas2it.constant.Constant;
import com.ideas2it.controller.InstagramController;
import com.ideas2it.model.UserProfile;

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
        do {
            userMessage.append(" Enter 1 for add User"); 
            userMessage.append("\n Enter 2 for remove user");
            userMessage.append("\n Enter 3 for display the user");
            userMessage.append("\n Enter 4 for update the User");
            userMessage.append("\n Enter 5 for search ");
            userMessage.append("\n Enter 6 for exit \n");
            System.out.println(userMessage);
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
            case Constant.ADDUSER:
                addUser();
                break;

            case Constant.REMOVEUSER:
                removeUser();
                break;

            case Constant.DISPLAYUSER:
                displayUser();
                break;

            case Constant.UPDATEUSER:
                updateUser();
                break;

            case Constant.SEARCH:
                search();
                break;

            case Constant.EXIT:
                break;

            default:
                System.out.println("");
                break;
            }
        } while (choice != Constant.EXIT); 
    }

    /**
     * creates the multiple account 
     */   
    public void addUser() {
        System.out.println("Create the Account Name");
        String accountName = scanner.nextLine();
        System.out.println("Enter the FirstName");
        String firstName = scanner.nextLine();
        System.out.println("Enter the LastName");
        String lastName = scanner.nextLine();
        System.out.println("Enter the Mobile Number");
        long mobileNumber = scanner.nextLong(); 
        scanner.nextLine();
        System.out.println("Create the Password");
        String createPassword = scanner.nextLine();   
        UserProfile userProfile = new UserProfile (firstName, lastName,
                                                      mobileNumber, 
                                                      createPassword, 
                                                      accountName);
        System.out.println(" Account Profile details\n" 
                              + instagramController
                              .addUser(accountName, userProfile));    
    }

    /**
     * remove the Account    
     */
    public void removeUser() {
        System.out.println("Enter the account name of user that you want to remove");
        String accountName = scanner.nextLine();
        System.out.println(instagramController.removeUser(accountName));
    }

    /**
     * search the Account    
     */
    public void search() {
        System.out.println("Enter the account name of user that you want to search");
        String accountName = scanner.nextLine();

        if( instagramController.search(accountName) == null) {
            System.out.println("No account found");
        } else {
            System.out.println(instagramController.search(accountName));   
        } 
    }

    /**
     * display the Account
     */
    public void displayUser() {
        System.out.println(instagramController.displayUser().values());
    }

    /**
     * update the Account    
     */
    public void updateUser() {
        StringBuilder userMessage = new StringBuilder();
        int choice;
        do {
            System.out.println("enter account name to update");
            String accountName = scanner.next();
            userMessage.append(" Enter 1 for update account name")
                 .append("\n Enter 2 for update first name")
                 .append("\n Enter 3 for update last name")
                 .append("\n Enter 4 for update mobile number")
                 .append("\n Enter 5 for update password")
                 .append("\n Enter 6 for exit");
            System.out.println(userMessage);
            choice = scanner.nextInt();
            scanner.nextLine();
            UserProfile userProfile;
            switch (choice) {
            case Constant.UPDATEACCOUNTNAME:
                System.out.println("enter account name to update");
                String updateAccountName = scanner.next();
                userProfile = instagramController.updateUser(updateAccountName,
                                                                accountName,
                                                                Constant.UPDATEACCOUNTNAME);
                break;

            case Constant.UPDATEFIRSTNAME:
                System.out.println("Enter first name to update");
                String updateFirstName = scanner.next();
                userProfile = instagramController.updateUser(updateFirstName,
                                                                accountName,
                                                                Constant.UPDATEFIRSTNAME);
                break;

            case Constant.UPDATELASTNAME:
                System.out.println("enter last name to update");
                String updateLastName = scanner.next();
                userProfile = instagramController.updateUser(updateLastName,
                                                                accountName,
                                                                Constant.UPDATELASTNAME);
                break;

            case Constant.UPDATEMOBILENUMBER:
                System.out.println("enter mobile number to update");
                long mobileNumber = scanner.nextLong();
                String updateMobileNumber = String.valueOf(mobileNumber);
                userProfile = instagramController.updateUser(updateMobileNumber,
                                                                accountName,
                                                                Constant.UPDATEMOBILENUMBER);
                break;

            case Constant.UPDATEPASSWORD:
                System.out.println("enter password to update");
                String updatePassword = scanner.next();
                userProfile = instagramController.updateUser(updatePassword,
                                                                accountName,
                                                                Constant.UPDATEPASSWORD);
                break;

            default:
                System.out.println("");
                break;
            }
        } while (choice != Constant.EXIT); 
        System.out.println(userProfile);   
    }
} 












   