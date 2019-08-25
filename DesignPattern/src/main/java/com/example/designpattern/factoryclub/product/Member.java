package com.example.designpattern.factoryclub.product;

import java.util.Date;

import com.example.designpattern.factoryclub.MemberEnum.MemberLocation;
import com.example.designpattern.factoryclub.MemberEnum.MemberType;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public abstract class Member {
	public Date startDate;
	public Date endDate;
	public double bookingDiscount;
	public MemberType type;
	public MemberLocation location;
	
	public void printMemberInfo() {
		System.out.println(this);
	}

}
