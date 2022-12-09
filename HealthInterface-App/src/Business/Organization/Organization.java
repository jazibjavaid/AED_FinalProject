/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.AmbulanceDriver.AmbulanceDriverDirectory;
import Business.Doctor.DoctorDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Nurse.NurseDirectory;
import Business.PatientManager.PatientManagerDirectory;
import Business.Pharmacist.PharmacistDirectory;
import Business.Tester.TesterDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkProcess.HealthRequestDirectory;

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
    private PatientManagerDirectory patientManagerDirectory;
    private EmployeeDirectory employeeDirectory;
    private PatientManagerDirectory patManagerDir;
    private AmbulanceDriverDirectory ambulanceDriverDir;
    private TesterDirectory testerDir;
    private PharmacistDirectory pharmacistDir;
    private int orgID;
    private static int counter=0;
    private OrgType orgType;
    
    private HealthRequestDirectory requestDirectory = new HealthRequestDirectory();
    
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

    public UserAccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(UserAccountDirectory accountDirectory) {
        this.accountDirectory = accountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public PatientManagerDirectory getPatientManagerDirectory() {
        return patientManagerDirectory;
    }

    public void setPatientManagerDirectory(PatientManagerDirectory patientManagerDirectory) {
        this.patientManagerDirectory = patientManagerDirectory;
    }

    public PatientManagerDirectory getPatManagerDir() {
        return patManagerDir;
    }

    public void setPatManagerDir(PatientManagerDirectory patManagerDir) {
        this.patManagerDir = patManagerDir;
    }

    public TesterDirectory getTesterDir() {
        return testerDir;
    }

    public void setTesterDir(TesterDirectory testerDir) {
        this.testerDir = testerDir;
    }
    
    public HealthRequestDirectory getRequestDirectory() {
        if(requestDirectory == null){
            requestDirectory = new HealthRequestDirectory();
        }
        return requestDirectory;
    }
    
    public PatientManagerDirectory getpManagerDir() {
        if(patManagerDir==null){
            patManagerDir=new PatientManagerDirectory();
        }
        
        return patManagerDir;
    }

    public void setpManagerDir(PatientManagerDirectory patManagerDir) {
        this.patManagerDir = patManagerDir;
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

    public PharmacistDirectory getPharmacistDir() {
        return pharmacistDir;
    }

    public void setPharmacistDir(PharmacistDirectory pharmacistDir) {
        this.pharmacistDir = pharmacistDir;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
