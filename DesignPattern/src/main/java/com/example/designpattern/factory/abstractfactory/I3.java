package com.example.designpattern.factory.abstractfactory;

import com.example.designpattern.factory.abstractfactory.Enumerations.Processors;
import com.example.designpattern.factory.abstractfactory.abstractproduct.IProcessor;

public class I3 implements IProcessor{

	@Override
	public String getProcessor() {
		return Processors.I3.toString();
	}

}
