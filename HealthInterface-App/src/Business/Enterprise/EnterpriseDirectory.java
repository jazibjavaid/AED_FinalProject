/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    public Enterprise createAndAddEnterprise(String numOfBeds,String name,String contactNumber, String email, String address, String zipcode,Enterprise.EnterpriseCategory type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseCategory.Hospital){
            enterprise=new HospitalEnterprise(numOfBeds, name, contactNumber, email, address, zipcode);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseCategory.PatientSupportServices){
            enterprise=new PatientSupportEnterprise(name, contactNumber, email, address, zipcode);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseCategory.TestingCenters){
            enterprise=new TestingEnterprise(name, contactNumber, email, address, zipcode);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseCategory.Transportation){
            enterprise=new TransportationEnterprise(name, contactNumber, email, address, zipcode);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
