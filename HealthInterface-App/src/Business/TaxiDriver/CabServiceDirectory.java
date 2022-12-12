/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.TaxiDriver;

import java.util.ArrayList;

/**
 *
 * @author yuktachikate
 */
public class CabServiceDirectory {
    ArrayList<CabService> cabServiceList = new ArrayList<>();

    public ArrayList<CabService> getCabServiceList() {
        if(cabServiceList == null){
        cabServiceList = new ArrayList<>();
        }
        return cabServiceList;
    }

    public void setAmbulanceServiceList(ArrayList<CabService> ambulanceServiceList) {
        this.cabServiceList = cabServiceList;
    }
    
    public void addService(CabService ambService){
        cabServiceList.add(ambService);
        }
    
    public void removeService(CabService ambService){
              if(cabServiceList!=null){
        cabServiceList.remove(ambService);}
    }
}
