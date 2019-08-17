package com.example.designpattern.factory.abstractfactory;

import com.example.designpattern.factory.abstractfactory.Enumerations.Processors;

public class I7 implements IProcessor{

	@Override
	public String getProcessor() {
		return Processors.I7.toString();
	}

}
