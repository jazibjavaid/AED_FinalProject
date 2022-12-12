/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TestingServiceRole;
import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class TestingProviderOrganization extends Organization{
    
    public TestingProviderOrganization(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList();
        roles.add(new TestingServiceRole());
        return roles;
    }
    
    @Override
    public OrgType getOrgType() {
        return Organization.OrgType.TestingProvider;
    }
}
