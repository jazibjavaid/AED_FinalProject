/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkProcess;

import Business.Doctor.Doctor;
import Business.Employee.PrescriptionDirectory;
import Business.Enterprise.HospitalEnterprise;
import Business.Nurse.Nurse;
import Business.Organization.Organization;
import Business.PatientManager.PatientManager;
import Business.RegisteredUser.RegisteredUser;
import Business.Tester.TestsDirectory;
import java.util.Random;

/**
 *
 * @author jazibjavaid
 */
public class HealthRequest {
    private String requestNumber;
    private String status;
    private RegisteredUser user;
    private Doctor doctor;
    private Nurse nurse;
    private PatientManager patientManager;
    private Organization organization;
    private HospitalEnterprise hospital;
    private String fever;
    private String cough;
    private String bodyPain;
    private String otherSymptoms;
    private PrescriptionDirectory prescriptionDirectory;
    private TestsDirectory testDirectory;
    private TestsDirectory previousTestDirectory;
        

    public HealthRequest(String status, RegisteredUser user, Doctor doctor, Nurse nurse, PatientManager patientManager, Organization organization, String fever, String cough, String bodyPain, String otherSymptoms, HospitalEnterprise hospital) {
        Random rnd = new Random();
        requestNumber = "Req-" + rnd.nextInt(99999);
        this.status = status;
        this.user = user;
        this.doctor = doctor;
        this.nurse = nurse;
        this.patientManager = patientManager;
        this.organization = organization;
        this.fever = fever;
        this.cough = cough;
        this.bodyPain = bodyPain;
        this.otherSymptoms = otherSymptoms;
        this.hospital = hospital;
    }

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RegisteredUser getUser() {
        return user;
    }

    public void setUser(RegisteredUser user) {
        this.user = user;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public PatientManager getPatientManager() {
        return patientManager;
    }

    public void setPatientManager(PatientManager patientManager) {
        this.patientManager = patientManager;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getFever() {
        return fever;
    }

    public void setFever(String fever) {
        this.fever = fever;
    }

    public String getCough() {
        return cough;
    }

    public void setCough(String cough) {
        this.cough = cough;
    }

    public String getBodyPain() {
        return bodyPain;
    }

    public void setBodyPain(String bodyPain) {
        this.bodyPain = bodyPain;
    }

    public String getOtherSymptoms() {
        return otherSymptoms;
    }

    public void setOtherSymptoms(String otherSymptoms) {
        this.otherSymptoms = otherSymptoms;
    }

    public HospitalEnterprise getHospital() {
        return hospital;
    }

    public void setHospital(HospitalEnterprise hospital) {
        this.hospital = hospital;
    }

    public PrescriptionDirectory getPrescriptionDirectory() {
        return prescriptionDirectory;
    }

    public void setPrescriptionDirectory(PrescriptionDirectory prescriptionDirectory) {
        this.prescriptionDirectory = prescriptionDirectory;
    }

    public TestsDirectory getTestDirectory() {
        return testDirectory;
    }

    public void setTestDirectory(TestsDirectory testDirectory) {
        this.testDirectory = testDirectory;
    }

    public TestsDirectory getPreviousTestDirectory() {
        return previousTestDirectory;
    }

    public void setPreviousTestDirectory(TestsDirectory previousTestDirectory) {
        this.previousTestDirectory = previousTestDirectory;
    }

    @Override
    public String toString() {
        return requestNumber;
    }
}
