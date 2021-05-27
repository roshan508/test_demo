package com.selenium.javaBasics;

public class Switch {

	public static void main(String[] args) {

		int num = 5;
		String day;

		switch (num) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;	
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid day";
			break;
		}
		System.out.println(day);

		/*
		 * int year= 1; String subject="ECE";
		 * 
		 * switch(year) { case 1: System.out.println("1st Year"); break; case 2:
		 * System.out.println("2nd year");
		 * 
		 * switch(subject) { case "CSE": System.out.println("Computer science student");
		 * case "ECE": System.out.println("Electronics student"); }
		 * 
		 * }
		 */

	}

}
