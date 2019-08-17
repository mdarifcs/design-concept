package com.example.designpattern.factory.abstractfactory;

import com.example.designpattern.factory.abstractfactory.Enumerations.ComputerTypes;

public class Desktop implements ISystemType{

	@Override
	public String getSystemType() {
		return ComputerTypes.DESKTOP.toString();
	}

}
