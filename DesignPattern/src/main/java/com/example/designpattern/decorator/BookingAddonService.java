package com.example.designpattern.decorator;

import java.util.List;

import com.example.designpattern.decorator.decorators.BallPack;
import com.example.designpattern.decorator.decorators.BookingDecorator;
import com.example.designpattern.decorator.decorators.Coaching;
import com.example.designpattern.decorator.decorators.Rackets;

public class BookingAddonService {
	public static Integer applyAddons (Court court, List<BookingDecorator> decoratorList) {
		for (BookingDecorator bookingDecorator : decoratorList) {
			if (bookingDecorator instanceof BallPack) 
				court = new BallPack(court);
			else if (bookingDecorator instanceof Coaching)
				court = new Coaching(court);
			else if (bookingDecorator instanceof Rackets) 
				court = new Rackets(court);
		}
		return court.getCost();
	}
}
