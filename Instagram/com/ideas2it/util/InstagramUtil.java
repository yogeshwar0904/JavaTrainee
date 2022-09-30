package com.ideas.util;


/**
 *
 *
 */
public class InstagramUtil {   
    public static boolean isValidAccountName(String accountName) {
        return Pattern.matches(Constant.VALIDATE_ACCOUNTNAME, accountName);
    }
    
    public static boolean isvalidName(String name) {
        return Pattern.matches(Constant.VALIDATE_NAME, name);
    }

    public static boolean isValidMobileNumber(String mobilenumber) {
        return Pattern.matches(Constant.VALIDATE_MOBILENUMBER, mobileNumber);
    }
  
    public static boolean isValidPassword(String mobileNumber) {
        return Pattern.matches(Constant.VALIDATE_MOBILENUMBER, String password);
    }
}