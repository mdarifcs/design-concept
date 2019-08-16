package com.example.designpattern.factory.methodfactory;

import com.example.designpattern.factory.Employee;
import com.example.designpattern.factory.EmployeeType;

/**
 * @author mohammad.arif Differentiate employees as permanent and contract and
 *         segregate their pay scales as well as bonus based on their employee
 *         type.(Achieved using by simple factory)
 *          
 *         Calculate specific to Permanent employee house rent allowance (can achieve with factory methods)
 *         Calculate specific to Contract employee medical rent allowance (can achieve with factory methods)
 */
public class Main {

	public static void main(String[] args) {
		Employee contractEmployee = new Employee("Arif", "Software Engineer", "IT", EmployeeType.CONTRACT_EMPLOYEE);
		BaseEmployeeFactory contractEmployeeFactory = EmployeeManagerFactory.createFactory(contractEmployee);
		contractEmployeeFactory.applySalary();
		System.out.println(contractEmployee);

		Employee permanentEmployee = new Employee("firoz", "HR Manager", "HR", EmployeeType.PERMANENT_EMPLOYEE);
		BaseEmployeeFactory permanentEmployeeFactory = EmployeeManagerFactory.createFactory(permanentEmployee);
		permanentEmployeeFactory.applySalary();
		System.out.println(permanentEmployee);

	}

}
