package com.techelevator;

public class Gum extends VendingMachineItem {

    public Gum(String name, int price) {
        super(name, price);
    }

    public Gum(int quantity, VendingMachineItem item) {
        super(quantity, item);}


    @Override
    public String getSound() {
        return "Chew Chew, Yum!";
    }
}