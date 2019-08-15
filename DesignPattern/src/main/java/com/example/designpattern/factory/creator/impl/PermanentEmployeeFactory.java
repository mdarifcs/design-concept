package com.example.designpattern.factory.creator.impl;

import com.example.designpattern.factory.Employee;
import com.example.designpattern.factory.EmployeeType;
import com.example.designpattern.factory.creator.IEmployeeFactory;
import com.example.designpattern.factory.product.IEmployee;
import com.example.designpattern.factory.product.impl.PermanentEmployee;

public class PermanentEmployeeFactory implements IEmployeeFactory{

	@Override
	public Employee getEmployee() {
		IEmployee permanentEmployee = new PermanentEmployee();
		Employee employee = new Employee("Firoz", "HR Manager", "HR", EmployeeType.PERMANENT_EMPLOYEE,
				permanentEmployee.getBonus(), permanentEmployee.getPay());
		return employee;
	}

}
