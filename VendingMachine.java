package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class VendingMachine {
    private Map<String, VendingMachineItem> Inventory;

    public VendingMachine(){
        ReadFile fileReader = new ReadFile("vendingmachine.csv");
        Inventory = fileReader.load();
    }

    public Map<String, VendingMachineItem> getInventory() {
        return Inventory;
    }



//add UserBalance method here

    private int userBalance;

    public int getUserBalance() {
        return userBalance;
    }
}

