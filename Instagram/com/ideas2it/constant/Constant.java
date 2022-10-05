package com.ideas2it.constant;

import java.util.regex.Pattern;  
import java.util.regex.Matcher;
/**
 * Keep constant value to run the
 * particular features.
 *
 * @version     1.0 14 Sept 2022
 * @author      Yogeshwar
 */ 
public class Constant {
    public static final String VALIDATE_ACCOUNTNAME = "^[A-Za-z]\\w{5,29}$";
    public static final String VALIDATE_NAME  = ("[a-zA-Z]+$");
    public static final String VALIDATE_MOBILENUMBER = ("^[6-9]{1}[0-9]{9}");
    public static final String VALIDATE_PASSWORD = "^[a-zA-Z0-9]{4,9}[@$&*]{1,}[0-9]{1,3}";

    public static final int ADD = 1;
    public static final int REMOVE = 2;
    public static final int DISPLAY = 3;
    public static final int UPDATE = 4;
    public static final int SEARCH = 5;
    public static final int EXIT = 6;

    public static final int UPDATEACCOUNTNAME = 1;
    public static final int UPDATEFIRSTNAME = 2;
    public static final int UPDATELASTNAME = 3;
    public static final int UPDATEMOBILENUMBER = 4;
    public static final int UPDATEPASSWORD = 5;  
}