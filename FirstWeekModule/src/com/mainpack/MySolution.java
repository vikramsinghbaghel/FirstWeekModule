package com.mainpack;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.entities.ItemEntities;
import com.service.TotalTax;
import com.validation.Validate;

public class MySolution {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		TotalTax totalTax = new TotalTax();
		Logger logger = Logger.getLogger("MySolution"); // to display the output
		Validate val = new Validate(); // validation object to perform validation
		List<String> listOfItems = new ArrayList<>(); // to store the details of the items.
		String choice;
		do { // do while because at least once we have to run the loop and than after
			ItemEntities entity = new ItemEntities(); // that we will as the user whether he/she is willing to enter one
			// more item or not.
			do {
			logger.info("Enter Item name");
			entity.setItemName(scan.next());
			}while(!val.validateName(entity.getItemName()));
			
			do {
				try {
			logger.info("Enter Item price");
			entity.setItemPrice(scan.nextFloat());
				}catch(InputMismatchException e) {
					logger.info("Please enter the correct value of  price it should be floating point value ");
				}
				scan.nextLine();
				
			}while(!val.validatePrice(entity.getItemPrice()));

			do {
				try {
			logger.info("Enter Item quantity");
			entity.setItemQuantity(scan.nextInt());
				}catch(InputMismatchException f) {
					logger.info("Please enter the correct quantity of the item it should be an integral value");
				}
				scan.nextLine();
				
			}while(!val.validateQuantity(entity.getItemQuantity()));

			do {
				try {
			logger.info("Please select the Item Type");
			logger.info("1. Raw");
			logger.info("2. Manufactured");
			logger.info("3. Imported");
			int selectType =scan.nextInt();
			switch(selectType) {
			case 1:
				entity.setItemType("Raw");
				break;
			case 2:
				entity.setItemType("Manufactured");
				break;
			case 3:
				entity.setItemType("Imported");
				break;
			default:
				logger.info("Please correctly");
			}
				}catch(Exception e) {
					logger.info("Please enter the valid integeral value ");
				}
				scan.nextLine();
			}while(!val.validateType(entity.getItemType())) ;
			
			
				float finalcost = totalTax.getTotaltax(entity) + entity.getItemPrice();

				String output = "" + entity.getItemName() + " " + entity.getItemPrice() + " "
						+ totalTax.getTotaltax(entity) + " " + finalcost * entity.getItemQuantity();

				listOfItems.add(output);
			
			logger.info("Do you want to enter details of any other item (yes/no)");
			choice = scan.next();

		} while (choice.equalsIgnoreCase("yes"));

		Iterator<String> itr = listOfItems.iterator(); // to iterate the list of items
		while (itr.hasNext()) {
			logger.info(itr.next());
		}

		scan.close();

	}

}
