/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CabDriver;

import Business.Role.Role;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author yuktachikate
 */
public class CabDriver extends Business.Person.Person {
    
    private String licenseNumber;
    private String valStartDate;
    private String valEndDate;
    private String driverType;
    private int id;
    private static final AtomicInteger count = new AtomicInteger(0); 

    
    public CabDriver(String licenseNumber,String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username,String password, Role role) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email,username,password, role);
        this.licenseNumber=licenseNumber;
       this.id=count.incrementAndGet(); 
    }
    
}
