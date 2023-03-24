package com.bridglapz.employeewage;

public class EmployeeWageComputation{
	public static final int is_Part_Time_Working = 1;
	public static final int is_Full_Time_Working = 2;
	public static final int is_Employee_Rate_Per_Hour = 20;
	public static final int is_Maximum_Working_Hour_Month = 100;
	public static final int is_Maximum_Working_Day_Month = 20;

	public static void main(String args[]){
		int employeeHour = 0;
		int employeeTotalHour = 0;
		int employeeTotalDayMonth = 0;
		while (employeeTotalHour <= is_Maximum_Working_Hour_Month
				&& employeeTotalDayMonth < is_Maximum_Working_Day_Month) {
			employeeTotalDayMonth++;

			int check = (int) Math.floor(Math.random() * 10) % 3;
			switch (check) {
			case is_Part_Time_Working:
				employeeHour = 4;
				break;

			case is_Full_Time_Working:
				employeeHour = 8;
				break;

			default:
				employeeHour = 0;
			}

			int employeWage = employeeHour * is_Employee_Rate_Per_Hour;
			employeeTotalHour = employeeTotalHour + employeWage;
			System.out.println(employeWage);
			System.out.println(employeeTotalHour);
		}
}
}