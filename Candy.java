package com.techelevator;

public class Candy extends VendingMachineItem {


    public Candy(String name, int price) {
        super(name, price);
    }

    public Candy(int quantity, VendingMachineItem item) {
        super(quantity, item);

    }

    public Candy(String[] resultArray) {
        super();
    }

    @Override
    public String getSound() {
        return "Munch Munch, Yum!";
    }
}
