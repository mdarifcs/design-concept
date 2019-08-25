package com.example.designpattern.factory.abstractfactory;

import com.example.designpattern.factory.abstractfactory.abstractproduct.ISystemType;
import com.example.designpattern.factory.abstractfactory.concretefactory.MACFactory;

public class MACLaptopFactory extends MACFactory{
	@Override
	public ISystemType systemType() {
		return new Laptop();
	}
}
