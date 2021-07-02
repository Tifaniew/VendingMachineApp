package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ReadFileTest {
    @Test
    public void ReadFile_ArrayOfStrings_Should_Read_SourceFile() {
        //Arrange
        ReadFile readFile = new ReadFile("vendingmachine.csv");

        //Act
        Map<String, VendingMachineItem> result;

    }
}
