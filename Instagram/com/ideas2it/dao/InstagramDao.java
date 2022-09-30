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
     * @param accountName accountName of the user
     * @param user details of the user
     * @return User
     */
    public User add(String accountName, User user) {
        accounts.put(accountName, user);
        return user; 
    }

    /**
     * remove the user
     *
     * @param 
     * @return Map<String, User>
     *          
     */   
    public String deleteAccount(String accountName, String password) { 
        User user = null;
        user = accounts.get(accountName);
 	System.out.println("user" + user.getCreatePassword());
        if(null != user && user.getCreatePassword().equals(password)) {
            accounts.remove(accountName);
            return "Account removed successfully";
        } else {
             return "Entered data Invalid!!";
        }         
    }

    /**
     * search the user
     *
     * @param 
     * @return Map<String, User>
     *          
     */   
    public User search(String accountName) { 
        User user = null;
        user = accounts.get(accountName);
        if( null == user) {
            return null;
        } else {
            return user;
        }          
    }
 
    /**
     * Display the user
     *
     * @param 
     * @return Map<String, User>
     */  
    public Map<String, User> display() {
        return accounts;     
    }

    /**
     * update the user
     *
     * @param 
     * @return Map<String, User>
     *          
     */   
    public User update(String accountName, String updateValue, int choice) {
        User user = null;
        user = accounts.get(accountName); 
        if (null == user) {
            return null;
        } else {
            switch(choice) {
            case Constant.UPDATEACCOUNTNAME:
                user.setAccountName(updateValue); 
                break;
            case Constant.UPDATEFIRSTNAME:
                user.setFirstName(updateValue);
                break;

            case Constant.UPDATELASTNAME:
                user.setLastName(updateValue);
                break;

            case Constant.UPDATEMOBILENUMBER:
                user.setMobileNumber(Long.parseLong(updateValue));
                break;

            case Constant.UPDATEPASSWORD:	
                user.setCreatePassword( updateValue);
                break;

            default:
                user.setFirstName(updateValue);
                break;
            }
        }
        return user;
    }
}