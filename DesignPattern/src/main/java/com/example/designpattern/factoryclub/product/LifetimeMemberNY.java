package com.example.designpattern.factoryclub.product;

import java.time.LocalDate;

import com.example.designpattern.factoryclub.MemberEnum.MemberLocation;
import com.example.designpattern.factoryclub.MemberEnum.MemberType;
import com.example.designpattern.util.DateUtil;

public class LifetimeMemberNY extends Member {

	public LifetimeMemberNY() {
		LocalDate date = LocalDate.now();
		this.startDate = DateUtil.asDate(date);
		this.endDate = DateUtil.asDate(date.plusYears(100));
		this.bookingDiscount = 0.25;
		this.type = MemberType.LIFETIME;
		this.location = MemberLocation.NY;
	}
	
}
