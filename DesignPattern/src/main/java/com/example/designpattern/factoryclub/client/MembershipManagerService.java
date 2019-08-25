package com.example.designpattern.factoryclub.client;

import com.example.designpattern.factoryclub.MemberEnum.MemberType;
import com.example.designpattern.factoryclub.product.Member;

public abstract class MembershipManagerService {
	
	/**
	 * write all fixed operation here
	 */
	public Member createMembership(MemberType type) {
		Member member = this.createMamber(type);
		member.printMemberInfo();
		return member;
	}
	
	/**
	 * put all changeable component in abstract method
	 */
	public abstract Member createMamber(MemberType type);
}
