package com.example.designpattern.factory.methodfactory;

import com.example.designpattern.factory.Employee;
import com.example.designpattern.factory.simplefactory.IEmployeeManager;

public abstract class BaseEmployeeFactory {
	protected Employee emp;
	public BaseEmployeeFactory(Employee emp) {
		this.emp = emp;
	}
	
	public Employee applySalary() {
		IEmployeeManager manager = this.create();
		emp.setBonus(manager.getBonus());
		emp.setHourlyPay(manager.getPay());
		return emp;
	}
	
	public abstract IEmployeeManager create();
}
