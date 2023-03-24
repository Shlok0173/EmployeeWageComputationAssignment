package com.bridglapz.employeewage;

public class EmployeeWageComputation{
	
	public static void main(String args[]) {
		int is_Full_Time_Employee = 1;
		int working_Hour = 20;
		int employe_Hour = 0;
		int employe_Wage = 0;

		double check = Math.floor(Math.random() * 10) % 2;
		if (check == is_Full_Time_Employee) {
			employe_Hour = 8;
		} else {
			employe_Hour = 0;
		}
		int calculate_Result = working_Hour * employe_Hour;
		System.out.println(calculate_Result);
	}
}
