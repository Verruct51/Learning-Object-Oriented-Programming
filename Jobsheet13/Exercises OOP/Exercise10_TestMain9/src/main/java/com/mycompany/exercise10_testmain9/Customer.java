//Created By_22343019_Alvin Anugerah Pratama

package com.mycompany.exercise10_testmain9;

public class Customer {
      // Private instance variables
    private int id;
    private String name;
    private int discount;

    // Constructors
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // toString() method
    @Override
    public String toString() {
        return "Customer[id=" + id + ", name=" + name + ", discount=" + discount + "]";
    }
}
