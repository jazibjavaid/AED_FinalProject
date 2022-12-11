/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Organization.OrgType;
import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class OrganizationDirectory {
    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }

    public Organization createOrg(OrgType orgType,String name){
        Organization organization = null;
        if (orgType.getValue().equals(Organization.OrgType.Doctor.getValue())){
            organization = new DoctorOrganization(name);
            orgList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.OrgType.AmbulanceProvider.getValue())){
            organization = new AmbulanceProviderOrganization(name);
            orgList.add(organization);
        }
         else if (orgType.getValue().equals(Organization.OrgType.CabProvider.getValue())){
            organization = new CabProviderOrganization(name);
            orgList.add(organization);
        }
         else if (orgType.getValue().equals(Organization.OrgType.Nurse.getValue())){
            organization = new NurseOrganization(name);
            orgList.add(organization);
        }
         else if (orgType.getValue().equals(Organization.OrgType.PatientManager.getValue())){
            organization = new PatientManagerOrganization(name);
            orgList.add(organization);
        }
         else if (orgType.getValue().equals(Organization.OrgType.TestingProvider.getValue())){
            organization = new TestingProviderOrganization(name);
            orgList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.OrgType.Pharmacy.getValue())){
            organization = new PharmacyOrganization(name);
            orgList.add(organization);
        }
        return organization;
    }
    public Organization getOrganization(String name){
       Organization organization = null;
       for(Organization org : orgList){
           if(org.getOrgType().getValue().equalsIgnoreCase(name)){
               organization = org;
           }
       }
       return organization;
    }
}
