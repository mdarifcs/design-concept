package com.example.designpattern.factory.methodfactory;

import com.example.designpattern.factory.Employee;

public class EmployeeManagerFactory {
	public static BaseEmployeeFactory createFactory(Employee emp) {
		switch (emp.getEmployeeType()) {
		case CONTRACT_EMPLOYEE:
			return new ContractEmployeeFactory(emp);
		case PERMANENT_EMPLOYEE:
			return new PermanentEmployeeFactory(emp);
		}
		return null;
	}
}
