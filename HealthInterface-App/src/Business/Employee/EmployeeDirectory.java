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

    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
    }

    public ArrayList<Employee> getEmpList() {
        if (employeeList == null) {
            employeeList = new ArrayList();
        }
        return employeeList;
    }

    public Employee createEmp(String name) {
        Employee emp = new Employee();
        emp.setName(name);
        employeeList.add(emp);
        return emp;
    }

    public void removeEmp(Employee e) {
        employeeList.remove(e);
    }

    public void removeEmpByName(String empName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equalsIgnoreCase(empName)) {
                employeeList.remove(employeeList.get(i));
            }
        }

    }

}
