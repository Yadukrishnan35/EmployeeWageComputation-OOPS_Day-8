package com.bridgelabz;

public class Employee {

    static  int PRESENT = 1;
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		empcheck();
}

	public static void empcheck()
	{
		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
		if(empCheck == PRESENT)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
	
}
