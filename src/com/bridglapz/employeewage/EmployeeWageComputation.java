package com.bridglapz.employeewage;

public class EmployeeWageComputation {

	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	public static final int emp_rate_per_hour = 20;
	public static final int num_of_working_day = 20;
	public static final int max_hours_in_month = 100;

	public static void employeeWageComputation() {

		System.out.println("Welcome To  Employee Wage Computaion");

		int empHours = 0;
		int totalEmpHours = 0;
		int totalWorkingDay = 0;

		int checkEmployee = (int) Math.floor(Math.random() * 10) % 3;

		while (totalEmpHours <= max_hours_in_month && totalWorkingDay < num_of_working_day) {

			totalWorkingDay++;

			switch (checkEmployee) {
			case is_part_time:
				empHours = 4;
				break;

			case is_full_time:
				empHours = 8;
				break;

			default:
				empHours = 0;
				break;
			}

			int EmployeeWage = empHours * emp_rate_per_hour;
			totalEmpHours = totalEmpHours + EmployeeWage;

			System.out.println("EmployeeWage" + " " + EmployeeWage);
			System.out.println("TotalEmpHours" + " " + totalEmpHours);
		}
	}

	public static void main(String args[]) {
		employeeWageComputation();

	}

}
