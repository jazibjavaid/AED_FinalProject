/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class EmployeeDirectory {
   private ArrayList<Employee> empList;

    public EmployeeDirectory() {
    }

    public ArrayList<Employee> getEmpList() {
        if(empList == null){
            empList = new ArrayList();
        }
        return empList;
    }
    
    public Employee createEmp(String name){
        Employee emp= new Employee();
        emp.setName(name);
        empList.add(emp);
        return emp;
    }
    
     public void removeEmp(Employee e){
    
        empList.remove(e);
      
    }
      public void removeEmpByName(String empName){
        for(int i=0; i<empList.size(); i++){
            if(empList.get(i).getName().equalsIgnoreCase(empName)){
                empList.remove(empList.get(i));
            }
        }
        
      
    }
}
