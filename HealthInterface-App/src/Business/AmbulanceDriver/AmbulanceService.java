/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AmbulanceDriver;

/**
 *
 * @author jazibjavaid
 */
public class AmbulanceService {
    
    private String serviceName;
    private String serviceType;

    public AmbulanceService(String serviceName, String serviceType) {
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    
    @Override
    public String toString() {
        return serviceName;
    }
}
