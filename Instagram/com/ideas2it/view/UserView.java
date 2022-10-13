package com.ideas2it.view;

import java.util.HashMap;
import java.util.InputMismatchException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.Map;
import java.util.Scanner;

import com.ideas2it.constant.Constant;
import com.ideas2it.controller.InstagramController;
import com.ideas2it.model.User;

/**
 * Create instagram account for user
 * user.
 *
 * @version     1.0 14 Sept 2022
 * @author      Yogeshwar
 */ 
public class UserView {
    private InstagramController instagramController;
    private Scanner scanner;
    private static Logger logger = LogManager.getLogger(UserView.class);
    public UserView() {
        this.instagramController = new InstagramController();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Get the sugestion from the 
     * user to add, remove, display, 
     * update and search the account.
     */ 
    public void userInput() {
        StringBuilder userControl = new StringBuilder();   
        int choice;
        String backToMenu = "";
        userControl.append(" Enter 1 for add user") 
                   .append("\n Enter 2 for remove user")
                   .append("\n Enter 3 for display the user")
                   .append("\n Enter 4 for update the user")
                   .append("\n Enter 5 for search");

        do {
            try {
                System.out.println(userControl);
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
                    logger.info("Entered value is Invalid!!");
                    break;
                }
            } catch (InputMismatchException inputMismatch) {
                logger.error("Enter only Numbers");
		//scanner.skip("/r/n");
                //scanner.next();
            }
                userControl.delete(0, userControl.length() - 1);
                System.out.println("Enter Y for continue \nEnter any key for Exit");
                backToMenu = scanner.next();
                scanner.skip("/r/n");
        } while (backToMenu.equalsIgnoreCase("Y"));
    }

    /**
     * creates the account for user.         
     */   
    private void add() {
        String accountName; 
        String userName;
        long mobileNumber; 
        String password;
        boolean isValid = false;
        User user = null;

        accountName = getAccountName(); 
        userName = getUserName();
        mobileNumber = getMobileNumber();
        password = getPassword();     
        user = new User(accountName, userName,
                        mobileNumber, password);
        if (instagramController.add(accountName, user) != null) {
	    System.out.println("Account created sucessfully");   
        } else {
            logger.info("Account not created");
        }
 
    }

    /**
     * Create account name for user.
     *
     * @return String accountName
     *         accountName of the user
     */ 
    private String getAccountName() {
        String accountName; 
        boolean isValid = false;
        User user = null;
        do {
            System.out.println("Create the Account Name");
            accountName = scanner.nextLine();
            isValid = instagramController.isValidAccountName(accountName);
            user = instagramController.search(accountName);
            if (!isValid) {  
                logger.info("Entered wrong format try again");
            } 
        } while (!isValid);
        return accountName;
    }

    /**
     * creates the first name for user.
     *
     * @return String userName
     *         name of the user
     */ 
    private String getUserName() {
        String userName; 
        boolean isValid = false;
        do {
            logger.info("Enter your name");
            userName = scanner.nextLine();
            isValid = instagramController.isValidName(userName);

            if (!isValid) {
                logger.info("Entered wrong format try again");
            } 
        } while (!isValid);
        return userName;
    }
 
    /**
     * creates mobile number for user.
     *      
     * @return long mobileNumber
     *         mobileNumber of the user
     */     
    private long getMobileNumber() {
        long mobileNumber; 
        boolean isValid = false;
        do {
            logger.info("Enter the Mobile Number");
            mobileNumber = scanner.nextLong();
            scanner.skip("\r\n");
            isValid = instagramController.isValidMobileNumber(mobileNumber);

            if (!isValid) {
                logger.info("Entered wrong format try again");
            } 
        } while (!isValid); 
        return mobileNumber;
    }
  
    /**
     * creates password for user.
     *
     * @return String password
     *         password of the user.
     */   
    private String getPassword() {
        String password; 
        boolean isValid = false;
        do {
            logger.info("Create the Password");
            password = scanner.next();
            isValid = instagramController.isValidPassword(password);
            if (!isValid) {
                logger.info("Entered wrong format try again");
            } 
        } while (!isValid);
        return password;
    } 

    /**
     * remove the Account 
     */
    private void deleteAccount() {
        String accountName;
        String password;
        logger.info("Enter the account name you want to remove");
        accountName = scanner.nextLine();
        logger.info("Enter the password of your account");
        password = scanner.nextLine();

        if (instagramController.deleteAccount(accountName, password)) {
            logger.info("Account deleted successfully");         
        } else {
            logger.info("Entered invalid data");
        }
    }
      
    /**
     * search the Account    
     */
    private void search() {
        String accountName;
        logger.info("Enter the account name you want to search");
        accountName = scanner.nextLine();  
        User user = instagramController.search(accountName);

        if (null == user) {
            System.out.println("No account found");
        } else {
            System.out.println(user);   
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
        StringBuilder userControl = new StringBuilder();
        int choice;
        logger.info("enter account name to update");
        String accountName = scanner.next();
        User user = new User(); 
        try {
            userControl.append(" Enter 1 for update account name")
                         .append("\n Enter 2 for update user name")
                         .append("\n Enter 3 for update mobile number")
                         .append("\n Enter 4 for update password")
                         .append("\n Enter 5 to Exit");
            logger.info(userControl);
            choice = scanner.nextInt();
            scanner.skip("\r\n");     
        
            switch (choice) {
            case Constant.UPDATE_ACCOUNT_NAME:
                String updateAccountName;
                updateAccountName = getAccountName();
                user = instagramController.update(accountName, updateAccountName,
                                                  Constant.UPDATE_ACCOUNT_NAME);
                break;

            case Constant.UPDATE_USER_NAME:
                String updateUserName;
                updateUserName = getUserName();
                instagramController.update(accountName, updateUserName,
                                           Constant.UPDATE_USER_NAME);
                break;

            case Constant.UPDATE_MOBILE_NUMBER:
                long mobileNumber;
                mobileNumber = getMobileNumber(); 
                user = instagramController.update(accountName, String.valueOf(mobileNumber),
                                           Constant.UPDATE_MOBILE_NUMBER);
                break;

            case Constant.UPDATE_PASSWORD:
                String updatePassword;
                updatePassword = getPassword();
                instagramController.update(accountName, updatePassword,
                                           Constant.UPDATE_PASSWORD);
                break;

            case Constant.EXIT:
                break;

            default:
                userControl.delete(0, userControl.length() - 1);
                userControl.append("Entered value is Invalid!! ")
                           .append("\n enter correct option to update");
                System.out.println(userControl);
                break;
            }

            if(accountName.equals(user.getAccountName())) {
                System.out.println("account updated Successfully");
            } else {
                System.out.println("account not updated");
            }
 
        } catch (InputMismatchException intputMismatch) {
            logger.error("Enter only Numbers"); 
            scanner.next();     
        }
    }
}    