package com.bridglapz.employeewage;

public class EmployeeWageComputation{
	
	  public static final int is_Full_Time=2;
	  public static final int is_Work_fee=20;
	   public static final int is_Part_Time=1;
	 
	public static void main(String args[]) {

	int employe_Hour=0;


	int check=(int)Math.floor(Math.random()*10)%3;
	switch(check) {
	case is_Part_Time:
		employe_Hour=4;
		break;
		
	case is_Full_Time:
		employe_Hour=8;
		break;
		
	   default:
		   employe_Hour=0;
	}

	int employeWage=employe_Hour*is_Work_fee;
	System.out.println(employeWage);
}
}