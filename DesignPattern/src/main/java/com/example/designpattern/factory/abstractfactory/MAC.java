package com.example.designpattern.factory.abstractfactory;

import com.example.designpattern.factory.abstractfactory.Enumerations.Brands;

public class MAC implements IBrand{

	@Override
	public String getBrand() {
		return Brands.APPLE.toString();
	}

}
