/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Tester;

import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class TesterDirectory {
    
    ArrayList<Tester> testerDirectory;

    public ArrayList<Tester> gettesterDirectory() {
        if(testerDirectory == null){
            testerDirectory = new ArrayList<>();
        }
        return testerDirectory;
    }

    public void settesterDirectory(ArrayList<Tester> testerDirectory) {
        this.testerDirectory = testerDirectory;
    }
    
    public void addtester(Tester tester)
    {
        testerDirectory.add(tester);
    }
    
        public TesterDirectory() {
         
            testerDirectory = new ArrayList<>();
       
    }
    
    public boolean removetester(Tester tester){
        for(int i=0;i<testerDirectory.size();i++){
        Tester p = testerDirectory.get(i);
        if(p.getId() == tester.getId()){
            testerDirectory.remove(p);
            return true;
        }
     }
    return false;
    } 
    
      public Tester findTester(String username){
        Tester tester = null;
        for(Tester test: testerDirectory){
            if(test.getUsername().equalsIgnoreCase(username)){
            tester=test;
            }
        }
        return tester;
    }
}
