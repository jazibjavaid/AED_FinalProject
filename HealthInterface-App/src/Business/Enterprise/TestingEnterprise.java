/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

/**
 *
 * @author jazibjavaid
 */
public class TestingEnterprise extends Enterprise {
    
    public TestingEnterprise(String name, String contactNumber, String email, String address, String zipcode) {
        super(EnterpriseCategory.TestingCenters, name, contactNumber, email, address, zipcode);
    }
    
}
