package com.service;

import com.entities.ItemEntity;

public class TotalTax {
	public float getTotaltax(ItemEntity entity) { // this method will return the total tax.

		ItemType calculate; // CalculateTax is the interface

		switch (entity.getItemType()) { // switch according to the item type.
		case "Raw":
			calculate = new Raw(); // Raw is the implementation class of CalculateTax interface.
			return calculate.taxCalculation(entity.getItemPrice());

		case "Manufactured":
			calculate = new Manufactured(); // Manufactured is the implementation class of CalculateTax interface.
			return calculate.taxCalculation(entity.getItemPrice());

		case "Imported":
			calculate = new Imported(); // Imported is the implementation class of CalculateTax interface.
			return calculate.taxCalculation(entity.getItemPrice());
		default:

		}
		return 0;

	}

}
