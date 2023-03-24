package com.bridglapz.employeewage;

public class EmployeeWageComputation {
	
  public static void main(String args[]) {
	  int Check_Employee=1;
	  	 double Attendance_Check=Math.floor(Math.random()*10)%2;
	  	 if(Check_Employee==Attendance_Check) {
	  		 System.out.println("Employe Are Parsent ");
	  	 }else {
	  		 System.out.println("Employe Are Absent");
	  	 }
  }
}
