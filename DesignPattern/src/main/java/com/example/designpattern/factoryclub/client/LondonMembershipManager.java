package com.example.designpattern.factoryclub.client;

import com.example.designpattern.factoryclub.MemberEnum.MemberType;
import com.example.designpattern.factoryclub.product.AnnualMamberLondon;
import com.example.designpattern.factoryclub.product.LifetimeMemberLondon;
import com.example.designpattern.factoryclub.product.Member;
import com.example.designpattern.factoryclub.product.TemporaryMember;
import com.example.designpattern.factoryclub.product.TemporaryMemberLondon;

public class LondonMembershipManager extends MembershipManagerService{

	@Override
	public Member createMamber(MemberType type) {
		Member member = null;
		switch (type) {
		case ANNUAL:
			member = new AnnualMamberLondon();
			break;
		case LIFETIME:
			member = new LifetimeMemberLondon();
			break;
		case TEMPORARY:
			member = new TemporaryMemberLondon();
			break;
		}
		return member;
	}

}
