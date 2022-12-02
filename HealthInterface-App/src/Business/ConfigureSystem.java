/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author jazibjavaid
 */
public class ConfigureSystem {
    
    public static EcoSystem configure(){
        
       EcoSystem ecosystem = EcoSystem.getInstance();
    
       UserAccount userAccount=new UserAccount("sysadmin", "sysadmin","System Admin", new SystemAdminRole());
       ecosystem.getUserAccountDir().addUserAccount(userAccount);
        
       return ecosystem;
    }
}
