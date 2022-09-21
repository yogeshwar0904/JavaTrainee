package com.ideas2it.service;

import java.util.HashMap;
import java.util.Map;

import com.ideas2it.model.UserProfile;

/**
 * Create the logic to run
 * features of application.
 *
 * @version     1.0 14 Sept 2022
 * @author      Yogeshwar
 */
public class InstagramService {
    private Map<String, UserProfile> accounts;
    
    public InstagramService() {
        this.accounts = new HashMap<>();
    }

    /**
     * Add the user
     *
     * @param accountName accountName of the user
     * @param userProfile details of the user
     * @return UserProfile
     */
    public UserProfile addUser(String accountName, UserProfile user) {
        accounts.put(accountName, user);
        return user;  
    }

    /**
     * Display the user
     *
     * @param 
     * @return Map<String, UserProfile>
     */
    public Map<String, UserProfile> displayUser() {
        return accounts;     
    }
}