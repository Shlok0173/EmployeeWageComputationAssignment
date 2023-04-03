package com.bridglapz.employeewage;

public class EmployeeWageComputation {

	public final int fullTime = 1;
	public final int partTime = 2;

	String company;
	int wagePerHr;
	int daysPerMonth;
	int workHrPerMonth;
	int totalWage;

	public EmployeeWageComputation(String company, int wagePerHr, int daysPerMonth, int workHrPerMonth) {
		this.company = company;
		this.wagePerHr = wagePerHr;
		this.daysPerMonth = daysPerMonth;
		this.workHrPerMonth = workHrPerMonth;
	}

	public String toString() {
		return "Total employee wage for " + company + " is " + totalWage;
	}

	void calculateWage() {

		int empHrs;
		int totalHours = 0;
		int dailyWage;
		int day = 0;

		while ((totalHours < workHrPerMonth) && (day < daysPerMonth)) {

			int attendance = (int) (Math.floor(Math.random() * 10)) % 3;

			switch (attendance) {
			case fullTime:
				empHrs = 8;
				break;
			case partTime:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalHours = totalHours + empHrs;
			dailyWage = wagePerHr * empHrs;
			totalWage = totalWage + dailyWage;
			day++;
		}
		System.out.println("Total work hours is: " + totalHours);
		System.out.println("Total work days are: " + day);
	}

	public static void main(String[] args) {

		EmployeeWageComputation Tata = new EmployeeWageComputation("Tata", 10, 20, 100);
		EmployeeWageComputation Reliance = new EmployeeWageComputation("Reliance", 20, 22, 90);
		EmployeeWageComputation Mahindra = new EmployeeWageComputation("Mahindra", 20, 22, 90);
		Tata.calculateWage();
		System.out.println(Tata);
		System.out.println("------------------------------------");
		Reliance.calculateWage();
		System.out.println(Reliance);
		System.out.println("------------------------------------");
		Mahindra.calculateWage();
		System.out.println(Mahindra);
	}
}