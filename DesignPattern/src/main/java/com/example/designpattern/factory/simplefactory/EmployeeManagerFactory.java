package com.example.designpattern.factory.simplefactory;

import com.example.designpattern.factory.EmployeeType;

public class EmployeeManagerFactory {
	public static IEmployeeManager getEmployeeManager(EmployeeType employeeType) {
		switch (employeeType) {
		case CONTRACT_EMPLOYEE:
			return new ContractEmployeeManager();
		case PERMANENT_EMPLOYEE:
			return new PermanentEmployeeManager();
		}
		return null;
	}
}
