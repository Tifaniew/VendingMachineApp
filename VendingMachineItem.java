package com.techelevator;

import com.techelevator.ReadFile;

import java.math.BigDecimal;

public abstract class VendingMachineItem {

    //Constants
    public static final int quantity = 5;

    private String name;
    private int price;


    // Constructor

    public VendingMachineItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public VendingMachineItem(int quantity, VendingMachineItem item) {
    }

    public VendingMachineItem(ReadFile readFile) {
    }

    public VendingMachineItem() {

    }

    // Getters

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Method
    public abstract String getSound();


}
