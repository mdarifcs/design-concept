package com.example.designpattern.factoryclub;

import com.example.designpattern.factoryclub.MemberEnum.MemberLocation;
import com.example.designpattern.factoryclub.MemberEnum.MemberType;
import com.example.designpattern.factoryclub.client.MembershipManagerFactory;
import com.example.designpattern.factoryclub.client.MembershipManagerService;
import com.example.designpattern.factoryclub.product.Member;

public class Main {
	public static void main(String[] args) {
		
		MembershipManagerService mmServiceNY = MembershipManagerFactory.createMembershipManagerService(MemberLocation.NY);
		Member nyMember1 = mmServiceNY.createMamber(MemberType.LIFETIME);
		Member nyMember2 = mmServiceNY.createMamber(MemberType.ANNUAL);
		nyMember1.printMemberInfo();
		nyMember2.printMemberInfo();
		
		
		MembershipManagerService mmServiceLondon = MembershipManagerFactory.createMembershipManagerService(MemberLocation.LONDON);
		Member londonMember1 = mmServiceLondon.createMamber(MemberType.LIFETIME);
		Member londonMember2 = mmServiceLondon.createMamber(MemberType.ANNUAL);
		londonMember1.printMemberInfo();
		londonMember2.printMemberInfo();
	}
}
