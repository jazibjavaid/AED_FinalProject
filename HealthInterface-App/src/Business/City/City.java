/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.City;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author jazibjavaid
 */
public class City {

    private String name;
    private EnterpriseDirectory enterpriseDir;

    public City(String name) {
        enterpriseDir = new EnterpriseDirectory();
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public EnterpriseDirectory getEnterpriseDir() {
        return enterpriseDir;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
