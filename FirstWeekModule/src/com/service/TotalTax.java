package com.service;

import com.entities.ItemEntities;

public class TotalTax {
	public float getTotaltax(ItemEntities entt) { // this method will return the total tax.

		CalculateTax calculate; // CalculateTax is the interface

		switch (entt.getItemType()) { // switch according to the item type.
		case "Raw":
			calculate = new Raw(); // Raw is the implementation class of CalculateTax interface.
			return calculate.taxCalculation(entt.getItemPrice());

		case "Manufactured":
			calculate = new Manufactured(); // Manufactured is the implementation class of CalculateTax interface.
			return calculate.taxCalculation(entt.getItemPrice());

		case "Imported":
			calculate = new Imported(); // Imported is the implementation class of CalculateTax interface.
			return calculate.taxCalculation(entt.getItemPrice());
		default:

		}
		return 0;

	}

}
