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
     * @param accountName 
     *        accountName of the user
     * @param user 
     *        details of the user
     * @return users
     *         details of user        
     */
    public User add(String accountName, User user) {
        return instagramDao.add(accountName, user);
    } 
  
    /**
     * remove the user
     *
     * @param accountName 
     *        name of the account
     * @param password
     *        password of the account
     * @return null if sucessfully deleted         
     */ 
    public String deleteAccount(String accountName, String password) { 
        return instagramDao.deleteAccount(accountName, password);
    }
   
    /* search the user
     *
     * @param String accountName 
     *        account name of user
     * @return user
     *         account name of user   
     */
    public User search(String accountName) { 
        return instagramDao.search(accountName);
    }

    /**
     * display the user
     *
     * @param 
     * @return Map<String, User>
     *         accounts of user
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
     * @return User
     *         update the users account        
     */   
    public User update(String accountName, String updateValue, int choice) { 
        return instagramDao.update(accountName, updateValue, choice);
    }
}