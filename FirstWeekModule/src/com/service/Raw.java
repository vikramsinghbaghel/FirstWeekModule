package com.service;

import com.constants.Constants;

public class Raw implements ItemType {
	// calculate the tax and return.
	@Override
	public float taxCalculation(float price) {

		return Constants.RATE / 100 * price;
	}

}
