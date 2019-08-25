package com.example.designpattern.decorator.decorators;

import com.example.designpattern.decorator.Court;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Coaching extends BookingDecorator{
	private Court courtBooking;
	
	public Coaching(Court courtBooking) {
		this.courtBooking = courtBooking;
	}

	@Override
	public Integer getCost() {
		return 300 + this.courtBooking.getCost();
	}

}
