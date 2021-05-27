package com.selenium.javaBasics;

public class datatype {

	public static void main(String[] args) {
		byte num_byte = 12;
		float num_float=23f;
		String s1 = "Hey,";
		String s2 = "Whats your name?";
		System.out.println(num_byte);
		System.out.println(num_float);
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));

		int state_population[][] = { { 200, 300, 400 }, { 500, 600, 700 } };
		int i, j;
		for (i = 0; i < state_population.length; i++)
			for (j = 0; j < state_population[i].length; j++) {
				System.out.println(state_population[i][j]);
			}

	}

}
