/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author jazibjavaid
 */
public class Role {
    
    public enum RoleType{
        DoctorRole("Doctor"),
        NurseRole("Nurse"),
        CabServiceRole("Cab Service"),
        AmbulanceServiceRole("Ambulance Service"),
        TestingServiceRole("Testing Service"),
        PatientManagerRole("Patient Manager"),
        HospitalEntAdmin("Hospital Admin"),
        PatientSupportEntAdmin("Patient Support Admin"),
        TestingEntAdmin("Testing Provider Admin"),
        TransportationEntAdmin("Transportation Admin"),
        PatientRole("Patient");
        
        private String value;
        private RoleType(String value){
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
}
