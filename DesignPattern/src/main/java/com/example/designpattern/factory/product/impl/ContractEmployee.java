package com.example.designpattern.factory.product.impl;

import com.example.designpattern.factory.product.IEmployee;

public class ContractEmployee implements IEmployee{

	@Override
	public double getBonus() {
		return 5;
	}

	@Override
	public double getPay() {
		return 15;
	}

}
