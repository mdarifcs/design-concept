package com.example.designpattern.factory.abstractfactory.concretefactory;

import com.example.designpattern.factory.abstractfactory.Desktop;
import com.example.designpattern.factory.abstractfactory.I7;
import com.example.designpattern.factory.abstractfactory.abstractinterface.IComputerFactory;
import com.example.designpattern.factory.abstractfactory.abstractproduct.IBrand;
import com.example.designpattern.factory.abstractfactory.abstractproduct.IProcessor;
import com.example.designpattern.factory.abstractfactory.abstractproduct.ISystemType;
import com.example.designpattern.factory.abstractfactory.concreteproduct.MAC;

public class MACFactory implements IComputerFactory{

	@Override
	public IProcessor processor() {
		return new I7();
	}

	@Override
	public IBrand brand() {
		return new MAC();
	}

	@Override
	public ISystemType systemType() {
		return new Desktop();
	}

}
