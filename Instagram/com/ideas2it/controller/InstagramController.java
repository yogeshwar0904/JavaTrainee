package com.ideas2it.controller;

import java.util.HashMap;
import java.util.Map;

import com.ideas2it.constant.Constant;
import com.ideas2it.model.User;
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
     * @param User user
     *        details of the user
     * @return User          
     */ 
    public User add(String accountName, User user) {
        return instagramService.add(accountName, user);    
    }

    /**
     * remove the user
     *
     * @param 
     * @return Map<String, User>
     *          
     */   
    public String remove(String accountName) { 
        return instagramService.remove(accountName);
    }

    /* search the user
     *
     * @param 
     * @return Map<String, User>
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
     * @param 
     * @return 
     *          
     */   
    public User update(String accountName, String updateValue, int choice) { 
        return instagramService.update(accountName, updateValue, choice);   
    }  
}