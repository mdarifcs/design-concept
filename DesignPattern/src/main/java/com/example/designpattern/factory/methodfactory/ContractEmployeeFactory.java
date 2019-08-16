package com.example.designpattern.factory.methodfactory;

import com.example.designpattern.factory.Employee;
import com.example.designpattern.factory.simplefactory.ContractEmployeeManager;
import com.example.designpattern.factory.simplefactory.IEmployeeManager;

public class ContractEmployeeFactory extends BaseEmployeeFactory{

	public ContractEmployeeFactory(Employee emp) {
		super(emp);
	}

	@Override
	public IEmployeeManager create() {
		ContractEmployeeManager manager = new ContractEmployeeManager();
		emp.setMedicalAllowance(manager.getMedicalAllowance());
		return manager;
	}

}
