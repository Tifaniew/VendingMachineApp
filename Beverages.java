package com.techelevator;

public class Beverages extends VendingMachineItem {

    public Beverages(String name, int price) {
        super(name, price);
    }

    public Beverages(int quantity, VendingMachineItem item) {
        super(quantity, item);}


    @Override
    public String getSound() {
        return "Glug Glug, Yum!";
    }

}
