/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

/**
 *
 * @author jazibjavaid
 */
public class Enterprise {
    private EnterpriseCategory enterpriseCategory;
    
    public Enterprise(EnterpriseCategory enterpriseCategory)
    {
        this.enterpriseCategory = enterpriseCategory;
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
