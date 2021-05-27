import java.util.Scanner;

public class add {
	int num3, num4, sum1;

	public void sum2() {
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Enter first number:");
		num3 = inputNum.nextInt();

		System.out.println("Enter Second number:");
		num4 = inputNum.nextInt();

		sum1 = num3 + num4;
		System.out.println("The result is : " + sum1);
		inputNum.close();
	}

	public static void main(String[] args) {
		/*
		 * int num1, num2, sum;
		 * 
		 * Scanner inputNum = new Scanner(System.in);
		 * System.out.println("Enter first number:"); num1 = inputNum.nextInt();
		 * 
		 * System.out.println("Enter Second number:"); num2 = inputNum.nextInt();
		 * 
		 * sum = num1 + num2; System.out.println("The result is : " + sum);
		 */
		add obj = new add();
		obj.sum2();
		
	}
	
}
