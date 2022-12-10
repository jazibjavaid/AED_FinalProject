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
        if (uaList == null) {
            uaList = new ArrayList<>();
        }
        return uaList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : uaList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public void removeUserAccountByUserName(String name){
         for(int i=0;i<uaList.size();i++){
             if(uaList.get(i).getEmployee().getName().equalsIgnoreCase(name)){
                 uaList.remove(uaList.get(i));
             }
         }
        
    }
    
    public UserAccount addUserAccount(UserAccount userAccount) {
        if (uaList == null) {
            uaList = new ArrayList<>();
        }
        uaList.add(userAccount);
        return userAccount;
    }

    public void removeUserAccount(UserAccount user) {
        uaList.remove(user);
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : uaList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
    
    public void removeUserAccountByUserName(String name){
         for(int i=0;i<uaList.size();i++){
             if(uaList.get(i).getEmployee().getName().equalsIgnoreCase(name)){
                 uaList.remove(uaList.get(i));
             }
         }
        
    }
}
