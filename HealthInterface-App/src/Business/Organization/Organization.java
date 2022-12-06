/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.AmbulanceDriver.AmbulanceDriverDirectory;
import Business.CabDriver.CabDriverDirectory;
import Business.Doctor.DoctorDirectory;
import Business.Nurse.NurseDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author jazibjavaid
 */
public class Organization {
    private String name;
    private String address;
    private String zipcode;
    private String contactNumber;
    private String email;
    
    private UserAccountDirectory accountDirectory;
    private DoctorDirectory docDir;
    private NurseDirectory nurDir;
    private CabDriverDirectory cabDriverDir;
    private AmbulanceDriverDirectory ambulanceDriverDir;


    private int orgID;
    private static int counter=0;
    private OrgType orgType;
    
    public enum OrgType{
        Doctor("Doctor Organization"),
        Nurse("Nurse Organization"),
        CabProvider("Cab Provider Organization"),
        AmbulanceProvider("Ambulance Provider Organization"),
        TestingProvider("Testing Provider Organization"),
        PatientManager("Patient Manager Organization");

        
        private String value;
        private OrgType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
          @Override
        public String toString() {
            return value;
        }
    }

    public Organization(String name, String address, String zipcode, String contactNumber, String email) {
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
        this.contactNumber = contactNumber;
        this.email = email;
        orgID = counter;
        ++counter;
    }
    
    public Organization(String name) {
        this.name = name;
    }
    
    public UserAccountDirectory getUserAccountDir() {
        if(accountDirectory==null){
        accountDirectory = new UserAccountDirectory();
        }
        return accountDirectory;
    }
    
    public CabDriverDirectory getCabDriverDir() {
        if(cabDriverDir==null){
            cabDriverDir=new CabDriverDirectory();
        }
        return cabDriverDir;
    }

    public void setCabDriverDir(CabDriverDirectory cabDriverDir) {
        this.cabDriverDir = cabDriverDir;
    }
    
    public AmbulanceDriverDirectory getAmbulanceDriverDir() {
         if(ambulanceDriverDir==null){
            ambulanceDriverDir=new AmbulanceDriverDirectory();
        }
        return ambulanceDriverDir;
    }

    public void setAmbulanceDriverDir(AmbulanceDriverDirectory ambulanceDriverDir) {
        this.ambulanceDriverDir = ambulanceDriverDir;
    }
    
    public DoctorDirectory getDocDir() {
        if(docDir == null){
            docDir=new DoctorDirectory();
        }
        return docDir;
    }
    
    public NurseDirectory getNurDir() {
        if(nurDir == null){
            nurDir=new NurseDirectory();
        }
        return nurDir;
    }

    public void setNurDir(NurseDirectory nurDir) {
        this.nurDir = nurDir;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getOrgID() {
        return orgID;
    } 

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    public OrgType getOrgType() {
        return orgType;
    }

    public void setOrgType(OrgType orgType) {
        this.orgType = orgType;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
