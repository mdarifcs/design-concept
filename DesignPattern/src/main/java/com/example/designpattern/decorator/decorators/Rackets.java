package com.example.designpattern.decorator.decorators;

import com.example.designpattern.decorator.Court;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Rackets extends BookingDecorator{
	private Court courtBooking;
	
	public Rackets(Court courtBooking) {
		this.courtBooking = courtBooking;
	}

	@Override
	public Integer getCost() {
		return 250 + this.courtBooking.getCost();
	}

}
