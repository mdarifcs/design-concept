package com.example.designpattern.factoryclub.client;

import com.example.designpattern.factoryclub.MemberEnum.MemberType;
import com.example.designpattern.factoryclub.product.AnnualMamber;
import com.example.designpattern.factoryclub.product.LifetimeMember;
import com.example.designpattern.factoryclub.product.Member;
import com.example.designpattern.factoryclub.product.TemporaryMember;

public class IndiaMembershipManager extends MembershipManagerService{
	@Override
	public Member createMamber(MemberType type) {
		Member member = null;
		switch (type) {
		case ANNUAL:
			member = new AnnualMamber();
			break;
		case LIFETIME:
			member = new LifetimeMember();
			break;
		case TEMPORARY:
			member = new TemporaryMember();
			break;
		}
		return member;
	}

}
