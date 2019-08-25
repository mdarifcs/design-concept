package com.example.designpattern.factory.abstractfactory;

import com.example.designpattern.factory.abstractfactory.abstractproduct.ISystemType;
import com.example.designpattern.factory.abstractfactory.concretefactory.DELLFactory;

public class DELLLaptopFactory extends DELLFactory{
	@Override
	public ISystemType systemType() {
		return new Laptop();
	}
}
