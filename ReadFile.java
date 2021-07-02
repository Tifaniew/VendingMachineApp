package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadFile {
    private File uploadFile;


    //Constructor
    public ReadFile(String sourcefile) {
        uploadFile = new File(sourcefile);
    }

    public Map<String, VendingMachineItem> load() {

        Map<String, VendingMachineItem> mapOfInventory = new HashMap<>();


        try (Scanner inputScanner = new Scanner(uploadFile.getAbsoluteFile())) {
            String result = "";
            while (inputScanner.hasNextLine()) {
                result = inputScanner.nextLine();
                String[] resultArray = result.split("\\|", 5);

                String slot = resultArray[0];
                String name = resultArray[1];
                double price = (Double.parseDouble(resultArray[2]));
                String typeOfSnack = resultArray[3];


                if (typeOfSnack.equals("Candy")) {
                    VendingMachineItem item = new Candy(name, (int) (price * 100));
//                    VendingMachineItem testItemInventory = new Candy(5, item);
                    mapOfInventory.put(slot, item);
                } else if (typeOfSnack.equals("Chip")) {
                    VendingMachineItem item = new Chips(name, (int) (price * 100));
//                    VendingMachineItem testItemInventory = new Chips(5, item);
                    mapOfInventory.put(slot, item);
                } else if (typeOfSnack.equals("Drink")) {
                    VendingMachineItem item = new Beverages(name, (int) (price * 100));
//                    VendingMachineItem testItemInventory = new Beverages(5, item);
                    mapOfInventory.put(slot, item);
                } else if (typeOfSnack.equals("Gum")) {
                    VendingMachineItem item = new Gum(name, (int) (price * 100));
//                    VendingMachineItem testItemInventory = new Gum(5, item);
                    mapOfInventory.put(slot, item);
                }

                // Create a map

//                mapOfInventory.put(slot, item);

            }

        } catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());

        }finally{
            return mapOfInventory;
        }
    }

}

