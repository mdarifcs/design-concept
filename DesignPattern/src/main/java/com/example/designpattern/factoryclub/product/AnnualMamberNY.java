package com.example.designpattern.factoryclub.product;

import java.time.LocalDate;

import com.example.designpattern.factoryclub.MemberEnum.MemberLocation;
import com.example.designpattern.factoryclub.MemberEnum.MemberType;
import com.example.designpattern.util.DateUtil;

public class AnnualMamberNY extends Member{
	public AnnualMamberNY() {
		LocalDate date = LocalDate.now();
		this.startDate = DateUtil.asDate(date);
		this.endDate = DateUtil.asDate(date.plusYears(1));
		this.bookingDiscount = 0.6;
		this.type = MemberType.ANNUAL;
		this.location = MemberLocation.INDIA;
		
	}
}
