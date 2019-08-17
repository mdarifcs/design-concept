package com.example.designpattern.factory.abstractfactory;

import com.example.designpattern.factory.abstractfactory.Enumerations.Brands;

public class DELL implements IBrand{

	@Override
	public String getBrand() {
		return Brands.DELL.toString();
	}

}
