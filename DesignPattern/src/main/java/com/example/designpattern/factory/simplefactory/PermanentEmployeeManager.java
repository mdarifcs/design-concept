package com.example.designpattern.factory.simplefactory;

public class PermanentEmployeeManager implements IEmployeeManager {

	@Override
	public double getBonus() {
		return 15;
	}

	@Override
	public double getPay() {
		return 20;
	}

}
