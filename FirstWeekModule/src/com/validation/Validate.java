package com.validation;

import java.util.logging.Logger;

public class Validate {
	// validations to the entities related to a particular item.
	Logger logger = Logger.getLogger("Validation");
	public boolean validateName(String name) {
		if(name.length() <2 )
			logger.info("the item name must contain at least two characters");
		return name.length() >= 2;
	}

	public boolean validatePrice(float price) {
		
		if(price<=0)
		logger.info("the item price must be greater then 0");
		return price > 0;
	}

	public boolean validateQuantity(int quantity) {
		if(quantity<=0)
		logger.info("the item quantity must be greater then 0");
		return quantity > 0;
	}

	public boolean validateType(String type) {
		if(type==null) {
			return false;
		}
		return type.equals("Raw") || type.equals("Manufactured") || type.equals("Imported");

	}

}
