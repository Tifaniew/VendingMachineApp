package com.techelevator;

public class Chips extends VendingMachineItem {

    public Chips(String name, int price) {
        super(name, price);
    }

    public Chips(int quantity, VendingMachineItem item) {
        super(quantity, item);}



    @Override
    public String getSound() {
        return "Crunch Crunch, Yum!";
    }
}
