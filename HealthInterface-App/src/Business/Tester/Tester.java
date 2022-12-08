/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Tester;

import Business.Role.Role;
import java.util.concurrent.atomic.AtomicInteger;
import Business.WorkProcess.HealthRequestDirectory;

/**
 *
 * @author jazibjavaid
 */
public class Tester extends Business.Person.Person {
    
    private String TestingService;
    private int id;
    private String name;
    private TestsDirectory testDirectory;
    private TestsDirectory addTestDirectory;
    private TestsDirectory completedTestsDirectory;
    private HealthRequestDirectory requestDirectory;
    private static final AtomicInteger count = new AtomicInteger(0);
    
    public Tester( String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username,String password, Role role) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email,username,password, role);
         this.id=count.incrementAndGet();
       
    }

    public String getTestingService() {
        return TestingService;
    }

    public void setTestingService(String TestingService) {
        this.TestingService = TestingService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TestsDirectory getTestDirectory() {
        if(testDirectory == null){
            testDirectory = new TestsDirectory();
        }
        
        return testDirectory;
    }

    public void setTestDirectory(TestsDirectory testDirectory) {
        this.testDirectory = testDirectory;
    }

    public TestsDirectory getCompletedTestsDirectory() {
        if(completedTestsDirectory==null){
            completedTestsDirectory = new TestsDirectory();
        }
        return completedTestsDirectory;
    }

    public void setCompletedTestsDirectory(TestsDirectory completedTestsDirectory) {
        this.completedTestsDirectory = completedTestsDirectory;
    }

    public TestsDirectory getAddTestDirectory() {
        if(addTestDirectory== null){
            addTestDirectory = new TestsDirectory();
        }
        return addTestDirectory;
    }

    public void setAddTestDirectory(TestsDirectory addTestDirectory) {
        this.addTestDirectory = addTestDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HealthRequestDirectory getRequestDirectory() {
        return requestDirectory;
    }

    public void setRequestDirectory(HealthRequestDirectory requestDirectory) {
        this.requestDirectory = requestDirectory;
    }
    
    @Override
    public String toString(){
        return this.getName();
    }
}
