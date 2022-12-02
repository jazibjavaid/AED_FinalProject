/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author shantanutyagi
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> uaList = new ArrayList<>();

    public UserAccountDirectory() {
        
    }
    
    public ArrayList<UserAccount> getUserAccountList() {
        if(uaList==null){
        uaList = new ArrayList<>();
        }
        return uaList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : uaList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount addUserAccount(UserAccount userAccount) {
        if(uaList==null){
        uaList = new ArrayList<>();
        }
        uaList.add(userAccount);
        return userAccount;
    }
    
}
