package com.example.designpattern.factory.abstractfactory;

import com.example.designpattern.factory.abstractfactory.Enumerations.Processors;

public class I5 implements IProcessor{

	@Override
	public String getProcessor() {
		return Processors.I5.toString();
	}

}
