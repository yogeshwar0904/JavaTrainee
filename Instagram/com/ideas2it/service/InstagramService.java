package com.ideas2it.service;

import java.util.HashMap;
import java.util.Map;

import com.ideas2it.dao.InstagramDao;
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
    private InstagramDao instagramDao;

    public InstagramService() {
        this.accounts = new HashMap<>();
        this.instagramDao = new InstagramDao();
    }

    /**
     * Add the user
     *
     * @param String accountName 
     *        accountName of the user
     * @param UserProfile user 
     *        details of the user
     * @return UserProfile
     */
    public UserProfile addUser(String accountName, UserProfile user) {
        return instagramDao.addUser(accountName, user);
    } 

    /**
     * remove the user
     *
     * @param 
     * @return Map<String, UserProfile>          
     */   
    public Map<String, UserProfile> removeUser() { 
         return instagramDao.removeUser();
    }

    /**
     * Display the user
     *
     * @param 
     * @return Map<String, UserProfile>
     */
    public Map<String, UserProfile> displayUser() {
        return instagramDao.displayUser();     
    }

    /**
     * update the user
     *
     * @param 
     * @return Map<String, UserProfile>         
     */   
    public Map<String, UserProfile> updateUser() { 
        return instagramDao.updateUser();
    }

}