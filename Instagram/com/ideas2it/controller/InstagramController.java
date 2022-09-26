package com.ideas2it.controller;

import java.util.HashMap;
import java.util.Map;

import com.ideas2it.constant.Constant;
import com.ideas2it.model.UserProfile;
import com.ideas2it.service.InstagramService;

/**
 * Get the information from UserView and pass 
 * to InstagramService
 *
 * @version     1.0 14 Sept 2022
 * @author      Yogeshwar
 */
public class InstagramController {
    private InstagramService instagramService;

    public InstagramController() {
        this.instagramService = new InstagramService(); 
    }

    /**
     * add the user
     *
     * @param String accountName
     *        name of the account
     * @param UserProfile user
     *        details of the user
     * @return UserProfile          
     */ 
    public UserProfile addUser(String accountName, UserProfile user) {
        return instagramService.addUser(accountName, user);    
    }

    /**
     * remove the user
     *
     * @param 
     * @return Map<String, UserProfile>
     *          
     */   
    public String removeUser(String accountName) { 
        return instagramService.removeUser(accountName);
    }

    /* search the user
     *
     * @param 
     * @return Map<String, UserProfile>
     *          
     */   
    public UserProfile search(String accountName) { 
        return instagramService.search(accountName);
    }
    /**
     * display the user
     *
     * @param 
     * @return Map<String, UserProfile>          
     */   
    public Map<String, UserProfile> displayUser() { 
        return instagramService.displayUser();
    }

    /**
     * update the user
     *
     * @param 
     * @return Map<String, UserProfile>
     *          
     */   
    public UserProfile updateUser(String accountName, String updateValue, int choice) { 
        return instagramService.updateUser(accountName, updateValue, choice);   
    }  
}