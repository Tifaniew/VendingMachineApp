package com.techelevator;


import org.junit.Test;

public class VendingMachineTest {
    private VendingMachine vendingMachine;

    @Test
    public void vendingMachine_Reads_List_of_Items() {
        vendingMachine = new VendingMachine();
        vendingMachine.getInventory();

    }


}