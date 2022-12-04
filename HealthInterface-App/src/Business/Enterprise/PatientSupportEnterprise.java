/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

/**
 *
 * @author jazibjavaid
 */
public class PatientSupportEnterprise extends Enterprise {
    
    public PatientSupportEnterprise(String name, String contactNumber, String email, String address, String zipcode) {
        super(EnterpriseCategory.PatientSupportServices, name, contactNumber, email, address, zipcode);
    }
    
}
