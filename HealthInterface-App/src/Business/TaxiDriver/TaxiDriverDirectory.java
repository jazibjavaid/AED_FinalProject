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
public class TaxiDriverDirectory {

    ArrayList<TaxiDriver> taxiDriverDirectory;

    public ArrayList<TaxiDriver> getTaxiDriverDirectory() {
        return taxiDriverDirectory;
    }

    public TaxiDriverDirectory() {

        taxiDriverDirectory = new ArrayList<>();
    }

    public void setTaxiDriverDirectory(ArrayList<TaxiDriver> taxiDriverDirectory) {
        this.taxiDriverDirectory = taxiDriverDirectory;
    }

    public void addTaxiDriver(TaxiDriver taxiDriver) {
        taxiDriverDirectory.add(taxiDriver);
    }

    public boolean removeTaxiDriver(TaxiDriver taxiDriver) {
        for (int i = 0; i < taxiDriverDirectory.size(); i++) {
            TaxiDriver td = taxiDriverDirectory.get(i);
            if (td.getId() == taxiDriver.getId()) {
                taxiDriverDirectory.remove(td);
                return true;
            }
        }
        return false;
    }

    public TaxiDriver findTaxiProvider(String username) {
        TaxiDriver taxiDriver = null;
        for (TaxiDriver td : taxiDriverDirectory) {
            if (td.getUsername().equalsIgnoreCase(username)) {
                taxiDriver = td;
            }
        }
        return taxiDriver;
    }

}
