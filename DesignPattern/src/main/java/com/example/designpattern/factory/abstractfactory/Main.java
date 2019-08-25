package com.example.designpattern.factory.abstractfactory;

import com.example.designpattern.factory.Employee;
import com.example.designpattern.factory.EmployeeType;
import com.example.designpattern.factory.abstractfactory.abstractinterface.IComputerFactory;
import com.example.designpattern.factory.abstractfactory.client.EmployeeSystemManager;
import com.example.designpattern.factory.abstractfactory.concretefactory.EmployeeSystemFactory;

/**
 * @author mohammad.arif Handout computers to permanent and contract employees
 *         based on the designation and employee type with below specification
 * 
 *         Permanent Employee 
 *         Managerial Position is eligible for Apple MAC Book Laptop.
 *         Non Managerial Position is eligible for Apple IMac desktop.
 *         
 *         Contract Employee
 *         Managerial Position is eligible for Dell Laptop
 *         Non managerial position is eligible for Dell desktop
 */
public class Main {
	public static void main(String[] args) {
		Employee contractEmployee = new Employee("Arif", "Software Engineer", "IT", EmployeeType.CONTRACT_EMPLOYEE);
		IComputerFactory factory = new EmployeeSystemFactory().create(contractEmployee);
		EmployeeSystemManager manager = new EmployeeSystemManager(factory);
		contractEmployee.setComputerDetails(manager.getSystemDetails());
		System.out.println(contractEmployee);

		Employee permanentEmployee = new Employee("firoz", "Manager", "HR", EmployeeType.PERMANENT_EMPLOYEE);
		IComputerFactory pFactory = new EmployeeSystemFactory().create(permanentEmployee);
		EmployeeSystemManager pManager = new EmployeeSystemManager(pFactory);
		contractEmployee.setComputerDetails(pManager.getSystemDetails());
		System.out.println(permanentEmployee);
	}
}
