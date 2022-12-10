/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CabDriver;

import java.util.ArrayList;

/**
 *
 * @author yuktachikate
 */
public class CabDriverDirectory {
    
        ArrayList<CabDriver> cabdriverDirectory;

    public ArrayList<CabDriver> getCabDriverDirectory() {
        return cabdriverDirectory;
    }
        public CabDriverDirectory() {
       
            cabdriverDirectory = new ArrayList<>();    
    }

    public void setCabDriverDirectory(ArrayList<CabDriver> cabdriverDirectory) {
        this.cabdriverDirectory = cabdriverDirectory;
    }
    
    
    public void addCabDriver(CabDriver cabdriver){
        cabdriverDirectory.add(cabdriver);
    }
    
    
    public boolean removeCabDriver(CabDriver cabdriver){
            for(int i=0;i<cabdriverDirectory.size();i++){
        CabDriver p = cabdriverDirectory.get(i);
        if(p.getId() == cabdriver.getId()){
            cabdriverDirectory.remove(p);
            return true;
        }
     }
        
    return false;
    }

    public CabDriver findCabProvider(String username){
        CabDriver cabProvider = null;
        for(CabDriver d: cabdriverDirectory){
            if(d.getUsername().equalsIgnoreCase(username)){
            cabProvider=d;
            }
        }
        return cabProvider;
    }
}
