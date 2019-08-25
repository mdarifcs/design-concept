package com.example.designpattern.factoryclub.client;

import com.example.designpattern.factoryclub.MemberEnum.MemberLocation;

public class MembershipManagerFactory {
	public static MembershipManagerService createMembershipManagerService(MemberLocation location) {
		MembershipManagerService membershipManagerService = null;
		switch (location) {
		case INDIA:
			membershipManagerService = new IndiaMembershipManager();
			break;
		case LONDON:
			membershipManagerService = new LondonMembershipManager();
			break;
		case NY:
			membershipManagerService = new NYMembershipManager();
			break;
		}
		return membershipManagerService;
	}
}
