package com.example.designpattern.factory;

import com.example.designpattern.factory.creator.impl.ContractEmployeeFactory;
import com.example.designpattern.factory.creator.impl.PermanentEmployeeFactory;

public class EmployeeManagerFactory {
	public static Employee getEmployee(EmployeeType employeeType) {
		switch (employeeType) {
		case CONTRACT_EMPLOYEE:
			return new ContractEmployeeFactory().getEmployee();
		case PERMANENT_EMPLOYEE:
			return new PermanentEmployeeFactory().getEmployee();
		default:
			return null;
		}
	}
}
