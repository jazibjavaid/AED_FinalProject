/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Nurse;

import java.util.ArrayList;

/**
 *
 * @author shantanutyagi
 */
public class NurseDirectory {
    
    ArrayList<Nurse> nurseDirectory;
    
    public ArrayList<Nurse> getnurseDirectory() {
        if(nurseDirectory == null){
            nurseDirectory = new ArrayList();
        }
        return nurseDirectory;
    }

    public void setnurseDirectory(ArrayList<Nurse> nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }
    
    public void addNurse(Nurse nurse)
    {
        nurseDirectory.add(nurse);
    }
    
    public boolean removeNurse(Nurse nurse){
     for(int i=0;i<nurseDirectory.size();i++){
        Nurse n = nurseDirectory.get(i);
        if(n.getId() == nurse.getId()){
            nurseDirectory.remove(n);
            return true;
        }
       
        
    }
    return false;
    
    }
}
