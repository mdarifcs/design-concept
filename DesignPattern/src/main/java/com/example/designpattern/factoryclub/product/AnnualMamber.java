package com.example.designpattern.factoryclub.product;

import java.time.LocalDate;

import com.example.designpattern.factoryclub.MemberEnum.MemberLocation;
import com.example.designpattern.factoryclub.MemberEnum.MemberType;
import com.example.designpattern.util.DateUtil;

public class AnnualMamber extends Member{
	public AnnualMamber() {
		LocalDate date = LocalDate.now();
		this.startDate = DateUtil.asDate(date);
		this.endDate = DateUtil.asDate(date.plusYears(1));
		this.bookingDiscount = 0.5;
		this.type = MemberType.ANNUAL;
		this.location = MemberLocation.INDIA;
	}
}
