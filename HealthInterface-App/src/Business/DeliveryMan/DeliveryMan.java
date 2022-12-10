/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Role.Role;
import Business.WorkProcess.OrderDirectory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author shantanutyagi
 */
public class DeliveryMan extends Business.Person.Person {

    private int id;
    private static final AtomicInteger count = new AtomicInteger(0);
    private Boolean available;
    private OrderDirectory orderDirectory;

    public DeliveryMan(Boolean available, String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email, String username, String password, Role role) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email, username, password, role);
        this.available = available;
        this.id = count.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public OrderDirectory getOrderDirectory() {
        if (orderDirectory == null) {
            orderDirectory = new OrderDirectory();
        }
        return orderDirectory;
    }

    @Override
    public String toString() {
        return getName();
    }

}
