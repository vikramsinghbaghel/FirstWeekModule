package com.service;

public class Imported implements CalculateTax {

	@Override
	public float taxCalculation(float price) { // calculate the tax and return.

		float finalTax = (0.1f) * price;
		float finalcost = finalTax + price;
		if (finalcost <= 100) {
			finalTax = finalTax + 5;
		} else if (finalcost > 100 && finalcost <= 200) {
			finalTax = finalTax + 10;
		} else {
			finalTax = finalTax + (0.05f) * finalcost;
		}

		return finalTax;
	}

}
