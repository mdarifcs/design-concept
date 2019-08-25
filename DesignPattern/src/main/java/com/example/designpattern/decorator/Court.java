package com.example.designpattern.decorator;

import lombok.ToString;

@ToString
public abstract class Court {
	public String name;
	public Integer rate;
	public String location;
	
	public abstract Integer getCost();
}
