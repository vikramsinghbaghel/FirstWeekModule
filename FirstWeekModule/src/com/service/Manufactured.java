package com.service;

import com.constants.Constants;

public class Manufactured implements CalculateTax {

	@Override
	public float taxCalculation(float price) { // calculate the tax and return.

		float temp = Constants.RATE / 100 * price;
		return temp + (0.02f) * (price + temp);
	}

}
