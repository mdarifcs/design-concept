package com.example.designpattern.factory.abstractfactory.client;

import com.example.designpattern.factory.abstractfactory.abstractinterface.IComputerFactory;
import com.example.designpattern.factory.abstractfactory.abstractproduct.IBrand;
import com.example.designpattern.factory.abstractfactory.abstractproduct.IProcessor;
import com.example.designpattern.factory.abstractfactory.abstractproduct.ISystemType;

public class EmployeeSystemManager {
	private IComputerFactory iComputerFactory;

	public EmployeeSystemManager(IComputerFactory iComputerFactory) {
		this.iComputerFactory = iComputerFactory;
	}
	
	public String getSystemDetails() {
		IBrand brand = this.iComputerFactory.brand();
		IProcessor processor = this.iComputerFactory.processor();
		ISystemType systemType = this.iComputerFactory.systemType();
		return brand.getBrand()+" "+processor.getProcessor()+" "+systemType.getSystemType();
	}
	
}
