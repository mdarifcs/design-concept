package com.example.designpattern.factory.abstractfactory;

import com.example.designpattern.factory.abstractfactory.Enumerations.ComputerTypes;

public class Laptop implements ISystemType{

	@Override
	public String getSystemType() {
		return ComputerTypes.LAPTOP.toString();
	}

}
