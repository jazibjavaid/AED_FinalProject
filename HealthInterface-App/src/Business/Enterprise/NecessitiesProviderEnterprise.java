/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shantanutyagi
 */
public class NecessitiesProviderEnterprise extends Enterprise {

    public NecessitiesProviderEnterprise(String name, String contactNumber, String email, String address, String zipcode) {
        super(EnterpriseCategory.NecessitiesProvider, name, contactNumber, email, address, zipcode);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
