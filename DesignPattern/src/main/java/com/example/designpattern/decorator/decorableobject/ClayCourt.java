package com.example.designpattern.decorator.decorableobject;

import com.example.designpattern.decorator.Court;

public class ClayCourt extends Court{
	
	public ClayCourt() {
		this.rate = 500;
	}

	@Override
	public Integer getCost() {
		return this.rate;
	}

}
