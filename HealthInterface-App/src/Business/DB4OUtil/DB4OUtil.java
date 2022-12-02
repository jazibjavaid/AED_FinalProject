/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DB4OUtil;

import Business.ConfigureSystem;
import Business.EcoSystem;

/**
 *
 * @author jazibjavaid
 */
public class DB4OUtil {
    
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }
    
    public EcoSystem retrieveSystem(){
     
        EcoSystem system;
            system = ConfigureSystem.configure();  // If there's no System in the record, create a new one
   
        return system;
    }
    
}
