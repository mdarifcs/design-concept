package com.example.designpattern.factory.methodfactory;

import com.example.designpattern.factory.Employee;
import com.example.designpattern.factory.simplefactory.IEmployeeManager;
import com.example.designpattern.factory.simplefactory.PermanentEmployeeManager;

public class PermanentEmployeeFactory extends BaseEmployeeFactory{

	public PermanentEmployeeFactory(Employee emp) {
		super(emp);
	}

	@Override
	public IEmployeeManager create() {
		PermanentEmployeeManager manager = new PermanentEmployeeManager();
		emp.setHouseAllowance(manager.getHouseAllowance());
		return manager;
	}

}
