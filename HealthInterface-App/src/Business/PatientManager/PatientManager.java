/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PatientManager;

import Business.Person.PersonalNotificationDirectory;
import Business.Role.Role;
import Business.WorkProcess.HealthRequestDirectory;
import Business.WorkProcess.ServiceRequestDirectory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author jazibjavaid
 */
public class PatientManager extends Business.Person.Person {

    private int id;
    private int currentPatients;
    private static final AtomicInteger count = new AtomicInteger(0);
    private HealthRequestDirectory requestDirectory = new HealthRequestDirectory();
    private PersonalNotificationDirectory notificationDirectory = new PersonalNotificationDirectory();
    private ServiceRequestDirectory servicerequestDirectoryAmb;
    private ServiceRequestDirectory servicerequestDirectorySan;
    private ServiceRequestDirectory servicerequestDirectoryCab;

    public PatientManager(String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email, String username, String password, Role role) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email, username, password, role);
        this.id = count.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentPatients() {
        return currentPatients;
    }

    public void setCurrentPatients(int currentPatients) {
        this.currentPatients = currentPatients;
    }

    public HealthRequestDirectory getRequestDirectory() {
        return requestDirectory;
    }

    public void setRequestDirectory(HealthRequestDirectory requestDirectory) {
        this.requestDirectory = requestDirectory;
    }

    public PersonalNotificationDirectory getNotificationDirectory() {
        return notificationDirectory;
    }

    public void setNotificationDirectory(PersonalNotificationDirectory notificationDirectory) {
        this.notificationDirectory = notificationDirectory;
    }

    public ServiceRequestDirectory getServicerequestDirectoryAmb() {
        if(servicerequestDirectoryAmb == null){
            servicerequestDirectoryAmb = new ServiceRequestDirectory();
        }
        return servicerequestDirectoryAmb;
    }

    public void setServicerequestDirectoryAmb(ServiceRequestDirectory servicerequestDirectoryAmb) {
        this.servicerequestDirectoryAmb = servicerequestDirectoryAmb;
    }

    public ServiceRequestDirectory getServicerequestDirectorySan() {
        return servicerequestDirectorySan;
    }

    public void setServicerequestDirectorySan(ServiceRequestDirectory servicerequestDirectorySan) {
        this.servicerequestDirectorySan = servicerequestDirectorySan;
    }

    public ServiceRequestDirectory getServicerequestDirectoryCab() {
        if(servicerequestDirectoryCab == null){
            servicerequestDirectoryCab = new ServiceRequestDirectory();
        }
        return servicerequestDirectoryCab;
    }

    public void setServicerequestDirectoryCab(ServiceRequestDirectory servicerequestDirectoryCab) {
        this.servicerequestDirectoryCab = servicerequestDirectoryCab;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
