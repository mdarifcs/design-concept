package com.example.designpattern.decorator.decorableobject;

import com.example.designpattern.decorator.Court;

public class HardCourt extends Court{

	public HardCourt() {
		this.rate = 300;
	}
	
	@Override
	public Integer getCost() {
		return this.rate;
	}

}
