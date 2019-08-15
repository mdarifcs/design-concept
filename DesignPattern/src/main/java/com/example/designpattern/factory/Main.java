package com.example.designpattern.factory;

public class Main {

	public static void main(String[] args) {
		Employee contractEmployee = EmployeeManagerFactory.getEmployee(EmployeeType.CONTRACT_EMPLOYEE);
		Employee permanentEmployee = EmployeeManagerFactory.getEmployee(EmployeeType.PERMANENT_EMPLOYEE);
		System.out.println(contractEmployee);
		System.out.println(permanentEmployee);
	}

}
