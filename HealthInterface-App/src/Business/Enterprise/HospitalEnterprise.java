/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class HospitalEnterprise extends Enterprise {
    private String bedCount;
    
    public HospitalEnterprise(String numberOfBeds, String name, String contactNumber, String email, String address, String zipcode) {
        super(EnterpriseCategory.Hospital, name, contactNumber, email, address, zipcode);
        this.bedCount = bedCount;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public String getNumberOfBeds() {
        return bedCount;
    }

    public void setNumberOfBeds(String numberOfBeds) {
        this.bedCount = bedCount;
    }
}
