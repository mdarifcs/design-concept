package com.example.designpattern.factory.abstractfactory.concretefactory;

import com.example.designpattern.factory.abstractfactory.Desktop;
import com.example.designpattern.factory.abstractfactory.I5;
import com.example.designpattern.factory.abstractfactory.abstractinterface.IComputerFactory;
import com.example.designpattern.factory.abstractfactory.abstractproduct.IBrand;
import com.example.designpattern.factory.abstractfactory.abstractproduct.IProcessor;
import com.example.designpattern.factory.abstractfactory.abstractproduct.ISystemType;
import com.example.designpattern.factory.abstractfactory.concreteproduct.DELL;

public class DELLFactory implements IComputerFactory{

	@Override
	public IProcessor processor() {
		return new I5();
	}

	@Override
	public IBrand brand() {
		return new DELL();
	}

	@Override
	public ISystemType systemType() {
		return new Desktop();
	}

}
