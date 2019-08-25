package com.example.designpattern.factoryclub.product;

import java.time.LocalDate;

import com.example.designpattern.factoryclub.MemberEnum.MemberLocation;
import com.example.designpattern.factoryclub.MemberEnum.MemberType;
import com.example.designpattern.util.DateUtil;

public class TemporaryMemberNY extends Member{
	public TemporaryMemberNY() {
		LocalDate date = LocalDate.now();
		this.startDate = DateUtil.asDate(date);
		this.endDate = DateUtil.asDate(date);
		this.bookingDiscount = 1;
		this.type = MemberType.TEMPORARY;
		this.location = MemberLocation.NY;
	}
}
