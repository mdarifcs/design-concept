package com.example.designpattern.factory.product.impl;

import com.example.designpattern.factory.product.IEmployee;

public class PermanentEmployee implements IEmployee{

	@Override
	public double getBonus() {
		return 10;
	}

	@Override
	public double getPay() {
		return 12;
	}

}
