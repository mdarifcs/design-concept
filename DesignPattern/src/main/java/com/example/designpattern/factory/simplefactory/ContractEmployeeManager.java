package com.example.designpattern.factory.simplefactory;

public class ContractEmployeeManager implements IEmployeeManager {

	@Override
	public double getBonus() {
		return 8;
	}

	@Override
	public double getPay() {
		return 10;
	}
	
	public double getMedicalAllowance() {
		return 100;
	}
}
