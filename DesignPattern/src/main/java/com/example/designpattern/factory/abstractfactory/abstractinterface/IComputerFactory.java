package com.example.designpattern.factory.abstractfactory.abstractinterface;

import com.example.designpattern.factory.abstractfactory.abstractproduct.IBrand;
import com.example.designpattern.factory.abstractfactory.abstractproduct.IProcessor;
import com.example.designpattern.factory.abstractfactory.abstractproduct.ISystemType;

public interface IComputerFactory {
	IProcessor processor();
	IBrand brand();
	ISystemType systemType();
}
