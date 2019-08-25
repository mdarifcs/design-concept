package com.example.designpattern.decorator;

import java.util.ArrayList;
import java.util.List;

import com.example.designpattern.decorator.decorableobject.GrassCourt;
import com.example.designpattern.decorator.decorators.BallPack;
import com.example.designpattern.decorator.decorators.BookingDecorator;
import com.example.designpattern.decorator.decorators.Coaching;
import com.example.designpattern.decorator.decorators.Rackets;

public class Main {
	public static void main(String[] args) {
		Court court = new GrassCourt();
		List<BookingDecorator> addOnsList = new ArrayList<>();
		addOnsList.add(new BallPack());
		addOnsList.add(new BallPack());
		addOnsList.add(new Coaching());
		addOnsList.add(new Rackets()); 

		Integer totalCost = BookingAddonService.applyAddons(court, addOnsList);
		System.out.println(totalCost);
	}
}
