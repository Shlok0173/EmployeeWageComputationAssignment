package com.bridglapz.employeewage;

public class EmployeeWageComputation{
	
	public static void main(String args[]) {
	 	int is_Employee_Part_Time=1;
    	int is_Employee_Full_Time=2;
    	int Time_Work=20;
    	int employe_Hour=0;
    	
    	double check=Math.floor(Math.random()*10)%3;
    	
    	if(check== is_Employee_Part_Time) {
    		employe_Hour=4;
    	}else if(check==is_Employee_Full_Time){
    		employe_Hour=8;
    	}else {
    		employe_Hour=0;
    	}
    	int wage_Result=employe_Hour*Time_Work;
    	System.out.println(wage_Result);
    }
}
