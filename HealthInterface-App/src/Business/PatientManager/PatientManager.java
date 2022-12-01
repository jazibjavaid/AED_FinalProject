/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PatientManager;

import Business.Role.Role;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author jazibjavaid
 */
public class PatientManager extends Business.Person.Person {
    
    private int id;
    private int currentPatients;
    private static final AtomicInteger count = new AtomicInteger(0); 
    
    public PatientManager(String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email, String username,String password, Role role) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email, username,password, role);
         this.id=count.incrementAndGet(); 
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
    
    @Override
    public String toString() {
         return String.valueOf(id);
    }
}
