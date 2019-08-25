package com.example.designpattern.factory.abstractfactory.concretefactory;

import com.example.designpattern.factory.Employee;
import com.example.designpattern.factory.abstractfactory.DELLLaptopFactory;
import com.example.designpattern.factory.abstractfactory.MACLaptopFactory;
import com.example.designpattern.factory.abstractfactory.abstractinterface.IComputerFactory;

public class EmployeeSystemFactory {
	public IComputerFactory create(Employee emp) {
		IComputerFactory computerFactory = null;

		switch (emp.getEmployeeType()) {
		case PERMANENT_EMPLOYEE:
			if (emp.getJobDescription() == "Manager") 
				computerFactory = new MACLaptopFactory();
			computerFactory = new MACFactory();
			break;
		case CONTRACT_EMPLOYEE:
			if (emp.getJobDescription() == "Manager") 
				computerFactory = new DELLLaptopFactory();
			computerFactory = new DELLFactory();
			break;
		}
		return computerFactory;
	}
}
