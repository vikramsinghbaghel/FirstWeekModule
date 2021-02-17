package com.service;

public class Imported implements ItemType {

	@Override
	public float taxCalculation(float price) { // calculate the tax and return.

		float finalTax = (0.1f) * price;
		float finalCost = finalTax + price;
		if (finalCost <= 100) {
			finalTax = finalTax + 5;
		} else if (finalCost > 100 && finalCost <= 200) {
			finalTax = finalTax + 10;
		} else {
			finalTax = finalTax + (0.05f) * finalCost;
		}

		return finalTax;
	}

}
