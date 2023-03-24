package com.bridglapz.employeewage;

public class EmployeeWageComputation{
	
	
	  public static final int is_Part_Time=1;
	   public static final int is_Full_Time=2;
	   public static final int is_Total_Emp_Rate=20;
	   public static final int number_Of_Working=20;
	   
	   
	   public static void main(String args[]) {
		   int employee_Hour=0;
		   int employee_Wage=0;
		   int  totalEmployeeWage=0;
		   int check=(int) Math.floor(Math.random()*10)%3;
		   for(int day=0;day<number_Of_Working;day++) {
		   switch(check) {
		   case  is_Part_Time:
			   employee_Hour=4;
			   break;
			   
		   case is_Full_Time:
			   employee_Hour=8;
			   break;
			   
			default:
				employee_Hour=0;
		   }
		  employee_Wage=employee_Hour* is_Total_Emp_Rate;
		  totalEmployeeWage=totalEmployeeWage+employee_Wage;
		  System.out.println(employee_Wage);
		  System.out.println(totalEmployeeWage);
	   }
	   }
}
	
