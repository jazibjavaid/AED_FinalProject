/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.City.City;
import Business.Organization.Organization;
import Business.RegisteredUser.RegisteredUserDirectory;
import java.util.ArrayList;

/**
 *
 * @author shantanutyagi
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem ecoSystem;
    private ArrayList<City> cityList;
    private RegisteredUserDirectory registeredUserDirectory;
    
    public static EcoSystem getInstance(){
        if(ecoSystem==null){
            ecoSystem=new EcoSystem();
        }
        return ecoSystem;
    }
    
    public static void setInstance(EcoSystem system) {
        ecoSystem = system;
    }
    
    private EcoSystem(){
        super(null);
        cityList=new ArrayList<>();
    }
    
    public City createAndAddCity(String name){
        City city = new City(name);
        cityList.add(city);
        return city;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    public RegisteredUserDirectory getRegisteredUserDirectory() {
        if(registeredUserDirectory==null){
            registeredUserDirectory=new RegisteredUserDirectory();
        }
       
        return registeredUserDirectory;
    }
}
