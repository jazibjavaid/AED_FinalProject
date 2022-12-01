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
public class AmbulanceServiceDirectory {
    
    ArrayList<AmbulanceService> ambulanceServiceList = new ArrayList<>();

    public ArrayList<AmbulanceService> getAmbulanceServiceList() {
        if(ambulanceServiceList == null){
        ambulanceServiceList = new ArrayList<>();
        }
        return ambulanceServiceList;
    }

    public void setAmbulanceServiceList(ArrayList<AmbulanceService> ambulanceServiceList) {
        this.ambulanceServiceList = ambulanceServiceList;
    }
    
    public void addService(AmbulanceService ambService){
        ambulanceServiceList.add(ambService);
        }
    
    public void removeService(AmbulanceService ambService){
              if(ambulanceServiceList!=null){
        ambulanceServiceList.remove(ambService);}
    }
}
