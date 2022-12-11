/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.PharmacistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class PharmacyOrganization extends Organization{
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList();
        roles.add(new PharmacistRole());
        return roles;
    }
    
    public PharmacyOrganization(String name) {
        super(name);
    }

    @Override
    public OrgType getOrgType() {
        return Organization.OrgType.Pharmacy;
    }
}
