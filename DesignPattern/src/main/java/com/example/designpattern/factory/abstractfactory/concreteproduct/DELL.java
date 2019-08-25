package com.example.designpattern.factory.abstractfactory.concreteproduct;

import com.example.designpattern.factory.abstractfactory.Enumerations.Brands;
import com.example.designpattern.factory.abstractfactory.abstractproduct.IBrand;

public class DELL implements IBrand{

	@Override
	public String getBrand() {
		return Brands.DELL.toString();
	}

}
