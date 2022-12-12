/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.AmbulanceServiceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class AmbulanceProviderOrganization extends Organization {
    
    public AmbulanceProviderOrganization(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList();
        roles.add(new AmbulanceServiceRole());
        return roles;
    }
    
    @Override
    public OrgType getOrgType() {
        return Organization.OrgType.AmbulanceProvider;
    }
}
