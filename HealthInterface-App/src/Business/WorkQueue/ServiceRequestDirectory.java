/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author yuktachikate
 */
public class ServiceRequestDirectory {
    
    ArrayList<ServiceRequest> serviceRequestList = new ArrayList<>();
    public ArrayList<ServiceRequest> getServiceRequestList() {
        if(serviceRequestList == null){
        serviceRequestList = new ArrayList<>();
        }
        return serviceRequestList;
    }
    
     public void addRequest(ServiceRequest request)
    {
        serviceRequestList.add(request);
    }
    
     public void removeRequest(ServiceRequest request)
    {
        serviceRequestList.remove(request);
    }
}
