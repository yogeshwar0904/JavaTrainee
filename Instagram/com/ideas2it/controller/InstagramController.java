package com.ideas2it.controller;

import java.util.HashMap;
import java.util.Map;

import com.ideas2it.constant.Constant;
import com.ideas2it.model.User;
import com.ideas2it.service.InstagramService;
import com.ideas2it.util.InstagramUtil;


/**
 * Get the information from UserView and pass 
 * to InstagramService
 *
 * @version     1.0 14 Sept 2022
 * @author      Yogeshwar
 */
public class InstagramController {
    private InstagramService instagramService;
    private InstagramUtil instagramUtil;

    public InstagramController() {
        this.instagramService = new InstagramService(); 
        this.instagramUtil = new InstagramUtil();
    }

    /**
     * add the user
     *
     * @param String accountName
     *        name of the account
     * @param User user
     *        details of the user
     * @return user
     *        details of the user           
     */ 
    public User add(String accountName, User user) {
        return instagramService.add(accountName, user);    
    }

    /**
     * remove the user
     *
     * @param String accountName 
     *        name of the account
     * @param String createpassword
     *        password of the account
     * @return null if sucessfully deleted
     *          
     */   
    public String deleteAccount(String accountName, String createPassword) { 
        return instagramService.deleteAccount(accountName, createPassword);
    }

    /* search the user
     *
     * @param String accountName 
     *        account name of user
     * @return user
     *         
     */   
    public User search(String accountName) { 
        return instagramService.search(accountName);
    }

    /**
     * display the user
     *
     * @param 
     * @return Map<String, User>          
     */   
    public Map<String, User> display() { 
        return instagramService.display();
    }

    /**
     * update the user
     *
     * @param string accountName
     *        account name of user
     * @param string updateValue
     *        change detail  of user
     * @param string accountName
     *        account name of user
     * @return user
     *          
     */   
    public User update(String accountName, String updateValue, int choice) { 
        return instagramService.update(accountName, updateValue, choice);   
    } 

    public boolean isValidAccountName(String accountName) {
        return InstagramUtil.isValidAccountName(accountName);
    }
 
    public boolean isValidName(String firstName) {
        return InstagramUtil.isValidName(firstName);
    }

    public boolean isValidName(String lastName) {
        return InstagramUlit.isValidName(lastName);
    }

    public boolean isValidMobileNumber(String mobileNumber) {
        return InstagramUtil.isValidmobileNumber(mobileNumber);
    }
 
    public boolean isValidPassword(String password) {
        return InstagramUtil.isValidPassword(password);
    }
}