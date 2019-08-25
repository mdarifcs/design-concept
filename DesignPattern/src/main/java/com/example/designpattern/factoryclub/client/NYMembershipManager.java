package com.example.designpattern.factoryclub.client;

import com.example.designpattern.factoryclub.MemberEnum.MemberType;
import com.example.designpattern.factoryclub.product.AnnualMamberNY;
import com.example.designpattern.factoryclub.product.LifetimeMemberNY;
import com.example.designpattern.factoryclub.product.Member;
import com.example.designpattern.factoryclub.product.TemporaryMember;
import com.example.designpattern.factoryclub.product.TemporaryMemberNY;

public class NYMembershipManager extends MembershipManagerService{

	@Override
	public Member createMamber(MemberType type) {
		Member member = null;
		switch (type) {
		case ANNUAL:
			member = new AnnualMamberNY();
			break;
		case LIFETIME:
			member = new LifetimeMemberNY();
			break;
		case TEMPORARY:
			member = new TemporaryMemberNY();
			break;
		}
		return member;
	}

}
