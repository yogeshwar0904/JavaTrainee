package com.ideas2it.dao;

import java.util.HashMap;
import java.util.Map;

import com.ideas2it.constant.Constant;
import com.ideas2it.model.UserProfile;

/**
 * Create the function to run
 * features of application.
 *
 * @version    1.0 14 Sept 2022
 * @author     Yogeshwar
 */
public class InstagramDao {
    private Map<String, UserProfile> accounts;
    
    public InstagramDao() {
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
     * remove the user
     *
     * @param 
     * @return Map<String, UserProfile>
     *          
     */   
    public String removeUser(String accountName) { 
        UserProfile userProfile = null;
        userProfile = accounts.get(accountName);
        if( null == userProfile) {
            return "Invalid Id, please check your id and try again";
        } else {
            accounts.remove(accountName);
            return "Account removed successfully";
        }         
    }

    /**
     * search the user
     *
     * @param 
     * @return Map<String, UserProfile>
     *          
     */   
    public UserProfile search(String accountName) { 
        UserProfile userProfile = null;
        userProfile = accounts.get(accountName);
        if( null == userProfile) {
            return null;
        } else {
            return userProfile;
        }          
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

    /**
     * update the user
     *
     * @param 
     * @return Map<String, UserProfile>
     *          
     */   
    public UserProfile updateUser(String accountName, String updateValue, int choice) {
        UserProfile userProfile = null;
        userProfile = accounts.get(accountName); 
        if( null == userProfile) {
            return null;
        } else {
        switch(choice) {
            case Constant.UPDATEACCOUNTNAME:
                userProfile.setAccountName(updateValue); 
                break;

            case Constant.UPDATEFIRSTNAME:
                userProfile.setFirstName(updateValue);
                break;

            case Constant.UPDATELASTNAME:
                userProfile.setLastName(updateValue);
                break;

            case Constant.UPDATEMOBILENUMBER:
                userProfile.setMobileNumber(Long.parseLong(updateValue));
                break;

            case Constant.UPDATEPASSWORD:	
                userProfile.setCreatePassword( updateValue);
                break;
        }
        }
        return userProfile;
    }
}