/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.RegisteredUser;

import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class RegisteredUserDirectory {
    
    ArrayList<RegisteredUser> registeredUserDirectory;

    public ArrayList<RegisteredUser> getRegisteredUserDirectory() {
        return registeredUserDirectory;
    }

      public RegisteredUserDirectory() {
        registeredUserDirectory = new ArrayList();
    }
    public void setRegisteredUserDirectory(ArrayList<RegisteredUser> registeredUserDirectory) {
        this.registeredUserDirectory = registeredUserDirectory;
    }
    
    public void addRegisteredUser(RegisteredUser user)
    {
        registeredUserDirectory.add(user);
    }
    
    public boolean removeRegisteredUser(RegisteredUser user){
       for(int i=0;i<registeredUserDirectory.size();i++){
        RegisteredUser n = registeredUserDirectory.get(i);
        if(n.getId() == user.getId()){
            registeredUserDirectory.remove(n);
            return true;
        }   
    }
    return false;
    }
    
    public RegisteredUser findRegisteredUser(String username){
        RegisteredUser user = null;
        for(RegisteredUser usr: registeredUserDirectory){
            if(usr.getUsername().equalsIgnoreCase(username)){
            user=usr;
            }
        }
        return user;
    }
}
