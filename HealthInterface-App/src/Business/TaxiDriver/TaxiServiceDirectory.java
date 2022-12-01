/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.TaxiDriver;

import java.util.ArrayList;

/**
 *
 * @author shantanutyagi
 */
public class TaxiServiceDirectory {

    ArrayList<TaxiService> taxiServiceList = new ArrayList<>();

    public ArrayList<TaxiService> getTaxiServiceList() {
        if (taxiServiceList == null) {
            taxiServiceList = new ArrayList<>();
        }
        return taxiServiceList;
    }

    public void setTaxiServiceList(ArrayList<TaxiService> taxiServiceList) {
        this.taxiServiceList = taxiServiceList;
    }

    public void addService(TaxiService taxiService) {
        taxiServiceList.add(taxiService);
    }

    public void removeService(TaxiService taxiService) {
        if (taxiServiceList != null) {
            taxiServiceList.remove(taxiService);
        }
    }

}
