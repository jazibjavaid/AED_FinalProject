/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Doctor.Doctor;
import Business.Nurse.Nurse;
import Business.RegisteredUser.RegisteredUser;
import java.util.Random;

/**
 *
 * @author yuktachikate
 */
public class ServiceRequest {
    private String serviceName;
    private String serviceType;
    private String status;
    private RegisteredUser user;
    private Doctor doctor;
    private Nurse nurse;
    private String serviceRequestId;
    private String startDate;
    private String endDate;
    private String repeat;
    
    

    public ServiceRequest(String serviceName, String serviceType, RegisteredUser user, Doctor doctor, Nurse nurse, String status) {
        Random rnd = new Random();
        serviceRequestId = "SerReq-" + rnd.nextInt(99999);
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.user = user;
        this.doctor = doctor;
        this.nurse = nurse;
        this.status = status;
    }
    

    public RegisteredUser getUser() {
        return user;
    }

    public void setUser(RegisteredUser user) {
        this.user = user;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

           @Override
    public String toString() {
        return serviceRequestId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

   
    
    
}
