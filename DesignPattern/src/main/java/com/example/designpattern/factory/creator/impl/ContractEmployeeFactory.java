package com.example.designpattern.factory.creator.impl;

import com.example.designpattern.factory.Employee;
import com.example.designpattern.factory.EmployeeType;
import com.example.designpattern.factory.creator.IEmployeeFactory;
import com.example.designpattern.factory.product.IEmployee;
import com.example.designpattern.factory.product.impl.ContractEmployee;

public class ContractEmployeeFactory implements IEmployeeFactory {

	@Override
	public Employee getEmployee() {
		IEmployee contractEmployee = new ContractEmployee();
		Employee employee = new Employee("Arif", "Software Engineer", "IT", EmployeeType.CONTRACT_EMPLOYEE,
				contractEmployee.getBonus(), contractEmployee.getPay());
		return employee;
	}

}
