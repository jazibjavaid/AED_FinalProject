/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkProcess;

import Business.Pharmacist.MedicineDirectory;
import Business.Pharmacist.Pharmacist;
import Business.RegisteredUser.RegisteredUser;
import java.util.Random;

/**
 *
 * @author shantanutyagi
 */
public class OrderMedicine {

    private String orderId;
    private String orderDate;
    private String status;
    private Pharmacist pharmacyName;
    private MedicineDirectory medicineDirectory;
    private RegisteredUser user;

    public OrderMedicine(String orderDate, String status, Pharmacist pharmacyName) {
        Random rnd = new Random();
        orderId = "Ord-" + rnd.nextInt(99999);
        this.orderDate = orderDate;
        this.status = status;
        this.pharmacyName = pharmacyName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pharmacist getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(Pharmacist pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public MedicineDirectory getMedicineDirectory() {
        if (medicineDirectory == null) {
            medicineDirectory = new MedicineDirectory();
        }
        return medicineDirectory;
    }

    public RegisteredUser getUser() {
        return user;
    }

    public void setUser(RegisteredUser user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return orderId;
    }
}
