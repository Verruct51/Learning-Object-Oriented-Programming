//Created By_22343019_Alvin Anugerah Pratama

package com.mycompany.exercise10_testmain9;

public class Invoice {
     // Private instance variables
    private int id;
    private Customer customer;
    private double amount;

    // Constructors
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount - (amount * customer.getDiscount() / 100.0);
    }

    // toString() method
    @Override
    public String toString() {
        return "Invoice[id=" + id + ", " + customer + ", amount=" + amount + "]";
    }
}
