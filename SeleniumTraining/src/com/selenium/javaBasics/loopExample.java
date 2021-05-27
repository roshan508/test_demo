package com.selenium.javaBasics;

public class loopExample {

	public static void main(String[] args) {

		// do while loop
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

		// while loop

		i = 10;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}

		//For loop
		System.out.println(" Using simple for loop :");
		for (i = 5; i <= 10; i++) {
			System.out.println(i);
		}
		
		String[] name = { "Java", "Ruby", "C++", "Python" };
		// for loop to read the array
		for (i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		// for each loop
		for (String myvar : name) {
			System.out.println(myvar);
		}
	}
}
