package com.example.designpattern.decorator.decorableobject;

import com.example.designpattern.decorator.Court;

public class GrassCourt extends Court{

	public GrassCourt() {
		this.rate = 700;
	}
	
	@Override
	public Integer getCost() {
		return this.rate;
	}

}
