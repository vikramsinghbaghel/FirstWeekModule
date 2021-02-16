package com.service;

import com.constants.Constants;

public class Raw implements CalculateTax {
	// calculate the tax and return.
	@Override
	public float taxCalculation(float price) {

		return Constants.RATE / 100 * price;
	}

}
