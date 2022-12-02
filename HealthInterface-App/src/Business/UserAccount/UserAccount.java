/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;

/**
 *
 * @author shantanutyagi
 */
public class UserAccount {
    private String username;
    private String password;
    private Role role;
    private Employee emp;

    private String name;

    public UserAccount(String username,String password,String name, Role role) {
        this.username=username;
        this.password=password;
        this.name=name;
        this.role=role;
    }   
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Employee getEmployee() {
        return emp;
    }
    
    public void setEmployee(Employee emp) {
        this.emp = emp;
    }
     
    @Override
    public String toString() {
        return username;
    }
    
}
