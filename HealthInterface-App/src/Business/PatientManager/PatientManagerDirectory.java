/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PatientManager;

import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class PatientManagerDirectory {
    ArrayList<PatientManager> patientManagerDirectory = new ArrayList();

    public ArrayList<PatientManager> getPatientManagerDirectory() {
        if(patientManagerDirectory == null){
            patientManagerDirectory = new ArrayList();
        }
        return patientManagerDirectory;
    }

    public void setPatientManagerDirectory(ArrayList<PatientManager> patientManagerDirectory) {
        this.patientManagerDirectory = patientManagerDirectory;
    }
  
    public PatientManagerDirectory() {

    }
    public void addpatientManager(PatientManager pmanager)
    {
        patientManagerDirectory.add(pmanager);
    }
    
    public boolean removepatientManager(PatientManager pmanager){
     for(int i=0;i<patientManagerDirectory.size();i++){
        PatientManager p = patientManagerDirectory.get(i);
        if(p.getId() == pmanager.getId()){
            patientManagerDirectory.remove(p);
            return true;
        }
    }
        return false;
    }
    
      public PatientManager findPatientManager(String username){
        PatientManager pat = null;
        for(PatientManager d: patientManagerDirectory){
            if(d.getUsername().equalsIgnoreCase(username)){
            pat=d;
            }
        }
        return pat;
    }
}
