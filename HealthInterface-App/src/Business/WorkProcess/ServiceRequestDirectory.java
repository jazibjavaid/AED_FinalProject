/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkProcess;

import java.util.ArrayList;

/**
 *
 * @author shantanutyagi
 */
public class ServiceRequestDirectory {

    ArrayList<ServiceRequest> serviceRequestList = new ArrayList<>();

    public ArrayList<ServiceRequest> getServiceRequestList() {
        if (serviceRequestList == null) {
            serviceRequestList = new ArrayList<>();
        }
        return serviceRequestList;
    }

    public void addRequest(ServiceRequest request) {
        serviceRequestList.add(request);
    }

    public void removeRequest(ServiceRequest request) {
        serviceRequestList.remove(request);
    }
}
