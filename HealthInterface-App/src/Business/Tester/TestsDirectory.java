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
public class TestsDirectory {
    
    ArrayList<Tests> testList  = new ArrayList<>();

    public ArrayList<Tests> getTestList() {
        if(testList == null){
            testList = new ArrayList<>();
        }
        return testList;
    }

    public void setTestList(ArrayList<Tests> testList) {
        this.testList = testList;
    }
    
    public void addTestsList(Tests test){
        testList.add(test);
    }
    public void removeTestsList(Tests test){
        if(testList!=null){
            testList.remove(test);
        }
    }
}
