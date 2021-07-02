package com.techelevator;


import com.techelevator.VendingMachine;
import com.techelevator.VendingMachineItem;
import com.techelevator.view.Menu;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VendingMachineCLI {


	//Main Menu
	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT};

	//Purchasing process menu
	private static final String PURCHASING_PROCESS_MENU_FEED_MONEY = "Please Feed Money";
	private static final String PURCHASING_PROCESS_MENU_BUY_ITEM = "Please Select A Product";
	private static final String PURCHASING_PROCESS_MENU_FINISH_TRANSACTION = "Transaction Completed";
	private static final String[] PURCHASING_PROCESS_MENU = {PURCHASING_PROCESS_MENU_FEED_MONEY, PURCHASING_PROCESS_MENU_BUY_ITEM, PURCHASING_PROCESS_MENU_FINISH_TRANSACTION};

	//purchase menu ($1,2,5,10)
	private static final String FEED_MENU_OPTION_ONE = "$1.00";
	private static final String FEED_MENU_OPTION_TWO = "$2.00";
	private static final String FEED_MENU_OPTION_FIVE = "$5.00";
	private static final String FEED_MENU_OPTION_TEN = "$10.00";
	private static final String FEED_MENU_OPTION_EXIT = "Main Menu";
	private static final String[] FEED_MENU_OPTIONS = {FEED_MENU_OPTION_ONE, FEED_MENU_OPTION_TWO, FEED_MENU_OPTION_FIVE, FEED_MENU_OPTION_TEN, FEED_MENU_OPTION_EXIT};

	private Menu menu;
	private VendingMachine vendingMachine = new VendingMachine();


	private String selectedProduct;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}


	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
				Map<String, VendingMachineItem> Inventory = vendingMachine.getInventory();
				for (Map.Entry<String, VendingMachineItem> entry : Inventory.entrySet()) {
					VendingMachineItem item = entry.getValue();
					System.out.println(item.getName() + " " + item.getQuantity() + "left");
				}


			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
				// we put the purchase method here that will bring in the purchase options
				while (true) {

					//userInput?
					String purchases = (String) menu.getChoiceFromOptions(PURCHASING_PROCESS_MENU);
					//feed money menu
					if (purchases.equals(PURCHASING_PROCESS_MENU_FEED_MONEY)) {
						while (true) {
							System.out.println("\nBalance is $ " + vendingMachine.getUserBalance());
							String feedMoney = (String) menu.getChoiceFromOptions(FEED_MENU_OPTIONS);
							if (feedMoney.equals(FEED_MENU_OPTION_EXIT)) {
								break;
							} else if(purchases.equals(PURCHASING_PROCESS_MENU_BUY_ITEM)) {
								System.out.println("\nBalance is $ " + vendingMachine.getUserBalance());
								System.out.println(vendingMachine.getInventory());

								// Show the list of products available and allow the customer to enter a code to select an item

//									Map<String, VendingMachineItem> Inventory = vendingMachine.getInventory();
//									for (Map.Entry<String, VendingMachineItem> entry : Inventory.entrySet()) {
//										VendingMachineItem item = entry.getValue();
//										String slot = entry.getKey();
//
//										System.out.println(slot + " " + item.getName());
//
//										//Prompt for user information
//
//										Scanner scanner = new Scanner(System.in);
//
//										String selectedProduct = scanner.next().toUpperCase();
//
////										TreeMap<Object, Object> mapOfInventory;
////										if(!mapOfInventory.containsKey(selectedProduct))


								//System.out.println("Balance is $" + "");
								//System.out.println("display items"); // list of snacks
								//System.out.println("Make your selection: ");
								//menu.getChoiceFromOptions("menu"); display item that was 2chosen

							} else if (purchases.equals(PURCHASING_PROCESS_MENU_FINISH_TRANSACTION)) {
								//The customer's money is returned using nickels, dimes, and quarters (using the smallest amount of coins possible).
								// The machine's current balance must be updated to $0 remaining.


								//System.out.println(MAIN_MENU_OPTION_DISPLAY_ITEMS);
								//String change =
								//System.out.println("Your change is $: ");
								//Machine should show a zero balance then the main menu
							}
						}

					}
				}

			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				break;
				//stop the loop

			}
		}
	}


	public static void main (String[]args){
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
