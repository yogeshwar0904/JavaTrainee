package com.ideas2it.service;

import java.util.HashMap;
import java.util.Map;

import com.ideas2it.constant.Constant;
import com.ideas2it.dao.InstagramDao;
import com.ideas2it.model.User;

/**
 * Create the logic to run
 * features of application.
 *
 * @version     1.0 14 Sept 2022
 * @author      Yogeshwar
 */
public class InstagramService {
    private Map<String, User> accounts;
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
    public User add(String accountName, User user) {
        return instagramDao.add(accountName, user);
    } 

    /**
     * remove the user
     *
     * @param 
     * @return Map<String, UserProfile>          
     */   
    public String remove(String accountName) { 
        return instagramDao.remove(accountName);
    }

    /**
     * search the user
     *
     * @param 
     * @return Map<String, User>          
     */   
    public User search(String accountName) { 
        return instagramDao.search(accountName);
    }

    /**
     * Display the user
     *
     * @param 
     * @return Map<String, User>
     */
    public Map<String, User> display() {
        return instagramDao.display();     
    }

    /**
     * update the user
     *
     * @param String accountName 
     *        accountName of the user
     * @param int choice
     *        choice of the user
     * @return Map<String, UserProfile>         
     */   
    public User update(String accountName, String updateValue, int choice) { 
        return instagramDao.update(accountName, updateValue, choice);
    }
}