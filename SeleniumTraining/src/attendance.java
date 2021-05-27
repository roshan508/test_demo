import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.constant;;

public class attendance {

	public static void main(String[] args) {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Selenium_Training\\drivers\\chromedriver88.exe");
		 * 
		 * WebDriver driver=new ChromeDriver(); driver.get(constant.URL);
		 * driver.findElement(By.id("txtUsername")).sendKeys(constant.Username);
		 * driver.findElement(By.id("txtPassword")).sendKeys(constant.Password);
		 * driver.findElement(By.id("btnLogin")).click();
		 */

		int number = new Random().nextInt(1000);
		int number1 = new Random().nextInt(2000);
		String password = "P#" + number + "@" + number1;
		// System.out.println("guess a number between 1-6");
		// Scanner sc =new Scanner(System.in);
		// int input=sc.nextInt();
		// if (number==input){
		// System.out.println("You Won");
		// }
	
		System.out.println("Your temporary password is : " + password);

		System.out.println("enter your temporary password");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(input);
		if (password == input ) {
			System.out.println("correct password");
		} else {
			//System.out.println("your password is incorrect password");
		}
	}

}
