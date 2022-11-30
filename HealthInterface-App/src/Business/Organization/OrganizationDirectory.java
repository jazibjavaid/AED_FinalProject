/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class OrganizationDirectory {
    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }

    public void setOrgList(ArrayList<Organization> orgList) {
        this.orgList = orgList;
    }
}
