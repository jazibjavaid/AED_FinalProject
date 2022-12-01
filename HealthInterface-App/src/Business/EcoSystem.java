/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.City.City;
import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author shantanutyagi
 */
public class EcoSystem extends Organization{
    
    private ArrayList<City> cityList;
    
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
    
    
}
