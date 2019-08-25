package com.example.designpattern.decorator.decorators;

import com.example.designpattern.decorator.Court;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BallPack extends BookingDecorator{
	private Court courtBooking;
	
	public BallPack(Court courtBooking) {
		this.courtBooking = courtBooking;
	}

	@Override
	public Integer getCost() {
		return 200 + this.courtBooking.getCost();
	}

}
