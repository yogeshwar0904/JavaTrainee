package com.ideas2it.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
    StringBuilder userMessage = new StringBuilder();

    public UserView() {
        this.instagramController = new InstagramController();
        this.scanner = new Scanner(System.in);
    }

    /**
     * call the user input method to continute
     * the updation of application.
     */ 
    public void getUserSugestion() {    
        String userChoice = "y"; 
        while (userChoice.equalsIgnoreCase("y")) {
            userInput();
            System.out.println("Enter y to continue");
            userChoice = scanner.nextLine();
        }
    }

    /**
     * Get the sugestion from the user based
     * on their choice.
     */ 
    public void userInput() {
        userMessage.append(" Enter 1 for add User"); 
        userMessage.append("\n Enter 2 for remove user");
        userMessage.append("\n Enter 3 for display the user");
        userMessage.append("\n Enter 4 for update the User");
        System.out.println(userMessage);
        final int ADDUSER = 1;
        final int REMOVEUSER = 2;
        final int DISPLAYUSER = 3;
        final int UPDATEUSER = 4;
        int choice;
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
        case ADDUSER:
            addUser();
            break;

        case REMOVEUSER:
            removeUser();
            break;

        case DISPLAYUSER:
            displayUser();
            break;

        case UPDATEUSER:
            updateUser();
            break;

        default:
            System.out.println("The Entered value is invalid!!!");
            break;
        }
        userMessage.delete(0, userMessage.length() - 1);
    }

    /**
     * creates the multiple account 
     */   
    public void addUser() {
        System.out.println("Create the Account Name");
        String accountName = scanner.nextLine();
        if (!instagramController.displayUser().containsKey(accountName)) {
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
        } else {
            System.out.println("User already exist");
        }
    }

    /**
     * remove the Account    
     */
    public void removeUser() {
       // System.out.println(instagramController.removeUser().);
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
       // System.out.println(instagramController);
    }

}    