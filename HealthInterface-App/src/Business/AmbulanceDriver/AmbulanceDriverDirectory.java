/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AmbulanceDriver;

import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class AmbulanceDriverDirectory {
    
    ArrayList<AmbulanceDriver> ambulancedriverDirectory;

    public ArrayList<AmbulanceDriver> getambulanceDriverDirectory() {
        if(ambulancedriverDirectory == null){
        ambulancedriverDirectory = new ArrayList<>();
        }
       
        return ambulancedriverDirectory;
    }
    
    public AmbulanceDriverDirectory() {
       ambulancedriverDirectory = new ArrayList<>();    
    }
    
    public void setambulanceDriverDirectory(ArrayList<AmbulanceDriver> ambulancedriverDirectory) {
        this.ambulancedriverDirectory = ambulancedriverDirectory;
    }
    
    public void addambulanceDriver(AmbulanceDriver ambulancedriver){
        ambulancedriverDirectory.add(ambulancedriver);
    }
    
    public boolean removeambulanceDriver(AmbulanceDriver ambulancedriver){
            for(int i=0;i<ambulancedriverDirectory.size();i++){
        AmbulanceDriver p = ambulancedriverDirectory.get(i);
        if(p.getId() == ambulancedriver.getId()){
            ambulancedriverDirectory.remove(p);
            return true;
        }
     }
        
    return false;
    }

    public AmbulanceDriver findAmbulanceProvider(String username){
        AmbulanceDriver ambProvider = null;
        for(AmbulanceDriver d: ambulancedriverDirectory){
            if(d.getUsername().equalsIgnoreCase(username)){
            ambProvider=d;
            }
        }
        return ambProvider;
    }
    
}
