package com.example.designpattern.factoryclub.product;

import java.time.LocalDate;

import com.example.designpattern.factoryclub.MemberEnum.MemberLocation;
import com.example.designpattern.factoryclub.MemberEnum.MemberType;
import com.example.designpattern.util.DateUtil;

public class AnnualMamberLondon extends Member{
	public AnnualMamberLondon() {
		LocalDate date = LocalDate.now();
		this.startDate = DateUtil.asDate(date);
		this.endDate = DateUtil.asDate(date.plusYears(1));
		this.bookingDiscount = 0.4;
		this.type = MemberType.ANNUAL;
		this.location = MemberLocation.LONDON;
		
	}
}
