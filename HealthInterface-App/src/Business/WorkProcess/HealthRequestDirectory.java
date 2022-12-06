/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkProcess;

import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class HealthRequestDirectory {
    private ArrayList<HealthRequest> requestList = new ArrayList<>();
    
    public ArrayList<HealthRequest> getRequestList() {
        if(requestList == null){
            requestList = new ArrayList<>();
        }
        return requestList;
    }

    public void setRequestList(ArrayList<HealthRequest> requestList) {
        this.requestList = requestList;
    }
    
    public void addRequestList(HealthRequest req){
        requestList.add(req);
    }
}
