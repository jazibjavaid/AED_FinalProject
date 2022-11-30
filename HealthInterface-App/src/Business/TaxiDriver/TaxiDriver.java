/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.TaxiDriver;

import Business.Role.Role;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author shantanutyagi
 */
public class TaxiDriver extends Business.Person.Person {

    private String licenseNumber;
    private String valStartDate;
    private String valEndDate;
    private String driverType;
    private int id;
    private static final AtomicInteger count = new AtomicInteger(0);
    private TaxiServiceDirectory taxiServiceDirectory;

    public TaxiDriver(String licenseNumber, String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email, String username, String password, Role role) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email, username, password, role);
        this.licenseNumber = licenseNumber;
        this.id = count.incrementAndGet();
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getValStartDate() {
        return valStartDate;
    }

    public void setValStartDate(String valStartDate) {
        this.valStartDate = valStartDate;
    }

    public String getValEndDate() {
        return valEndDate;
    }

    public void setValEndDate(String valEndDate) {
        this.valEndDate = valEndDate;
    }

    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTaxiServiceDirectory(TaxiServiceDirectory taxiServiceDirectory) {
        this.taxiServiceDirectory = taxiServiceDirectory;
    }
    
    @Override
    public String toString() {
       return getName();
    }

    public TaxiServiceDirectory getTaxiServiceDirectory() {
        if(taxiServiceDirectory == null){
            taxiServiceDirectory = new TaxiServiceDirectory();
        }
        return taxiServiceDirectory;
    }

}
