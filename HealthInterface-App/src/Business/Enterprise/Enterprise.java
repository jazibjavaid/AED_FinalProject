/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author jazibjavaid
 */
public class Enterprise extends Organization {
    private EnterpriseCategory enterpriseCategory;
    private OrganizationDirectory orgDir = new OrganizationDirectory();
    
    public Enterprise(EnterpriseCategory enterpriseCategory, String name, String contactNumber, String email, String address, String zipcode) {
        super(name, contactNumber, email, address, zipcode);
        this.enterpriseCategory = enterpriseCategory;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        if(orgDir == null){
            orgDir = new OrganizationDirectory();
        }
        return orgDir;
    }
    
    public enum EnterpriseCategory{
        Hospital("Hospital"),
        Transportation("Transpotation"),
        TestingCenters("Testing Centers"),
        PatientSupportServices("Patient Support Services");
        
        private String value;
        
        private EnterpriseCategory(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
        }
    }

    public EnterpriseCategory getEnterpriseCategory() {
        return enterpriseCategory;
    }

    public void setEnterpriseCategory(EnterpriseCategory enterpriseCategory) {
        this.enterpriseCategory = enterpriseCategory;
    }
}
