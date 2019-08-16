package com.example.designpattern.factory.simplefactory;

import com.example.designpattern.factory.Employee;
import com.example.designpattern.factory.EmployeeType;

/**
 * @author mohammad.arif Differentiate employees as permanent and contract and
 *         segregate their pay scales as well as bonus based on their employee
 *         type.
 */
public class Main {

	public static void main(String[] args) {
		Employee contractEmployee = new Employee("Arif", "Software Engineer", "IT", EmployeeType.CONTRACT_EMPLOYEE);
		IEmployeeManager contractEmployeeManager = EmployeeManagerFactory.getEmployeeManager(contractEmployee.getEmployeeType());
		contractEmployee.setBonus(contractEmployeeManager.getBonus());
		contractEmployee.setHourlyPay(contractEmployeeManager.getPay());
		System.out.println(contractEmployee);

		Employee permanentEmployee = new Employee("firoz", "HR Manager", "HR", EmployeeType.PERMANENT_EMPLOYEE);
		IEmployeeManager permanentEmployeeManager = EmployeeManagerFactory.getEmployeeManager(permanentEmployee.getEmployeeType());
		permanentEmployee.setBonus(permanentEmployeeManager.getBonus());
		permanentEmployee.setHourlyPay(permanentEmployeeManager.getPay());
		System.out.println(permanentEmployee);
	}

}
