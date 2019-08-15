package com.example.designpattern.factory;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String name;
	private String jobDescription;
	private String department;
	private EmployeeType employeeType;
	private double bonus;
	private double hourlyPay;
}
