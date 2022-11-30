/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Doctor;

import java.util.ArrayList;

/**
 *
 * @author shantanutyagi
 */
public class DoctorDirectory {
    
    ArrayList<Doctor> doctorDirectory;

    public ArrayList<Doctor> getdoctorDirectory() {
        if(doctorDirectory==null){
             doctorDirectory = new ArrayList<>();
        }
        
        return doctorDirectory;
    }

    public void setdoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
      public DoctorDirectory() {
    }

    
    public void addDoctor(Doctor doctor)
    {     
        doctorDirectory.add(doctor);
    }
    
    public boolean removeDoctor(Doctor doctor){
        for(int i=0;i<doctorDirectory.size();i++){
            Doctor d = doctorDirectory.get(i);
            if(d.getId() == doctor.getId()){
                doctorDirectory.remove(d);
                return true;
            }
        }
        return false;
    }

    public Doctor findDoctor(String username){
        Doctor doc = null;
        for(Doctor d: doctorDirectory){
            if(d.getUsername().equalsIgnoreCase(username)){
            doc=d;
            }
        }
        return doc;
    }
}
