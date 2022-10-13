package com.ideas2it.dao;

import java.util.HashMap;
import java.util.Map;

import com.ideas2it.constant.Constant;
import com.ideas2it.model.User;

/**
 * Create the function to run
 * features of application.
 *
 * @version    1.0 14 Sept 2022
 * @author     Yogeshwar
 */
public class InstagramDao {
    private Map<String, User> accounts;
    
    public InstagramDao() {
        this.accounts = new HashMap<>();
    }

    /**
     * Add the user
     *
     * @param accountName 
     *        accountName of the user
     * @param users 
     *        details of the user
     * @return users
     *         details of user
     */
    public User add(String accountName, User user) {
        accounts.put(accountName, user);
        return accounts.get(accountName); 
    }

    /**
     * remove the user
     *
     * @param accountName
     *        account name of user
     * @return deleted message                  
     */   
    public boolean deleteAccount(String accountName, String password) { 
        User user = accounts.remove(accountName);
        return accounts.containsKey(accountName);
    }

    /**
     * search the user
     *
     * @param accountName
     *        account name of user
     * @return users
     *         details of user 
     */   
    public User search(String accountName) { 
        return accounts.get(accountName);               
    }
 
    /**
     * Display the user
     *
     * @param 
     * @return Map<String, User>
     *         account of user
     */  
    public Map<String, User> display() {
        return accounts;     
    }

    /**
     * update the user
     *
     * @param accountName
     *        account name of user
     * @param updatevalue
     *        update detail of user
     * @param choice
     *        choice of user
     * @return Map<String, User>
     *         account of user 
     */   
    public User update(String accountName, User user) {
         return accounts.put(accountName, user);
    }
}