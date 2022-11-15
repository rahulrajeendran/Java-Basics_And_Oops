package conversion;

import java.util.Scanner;

public class Farentocel {
	void cel() {
		System.out.println("Enter the Fahrenheit");
		Scanner sc=new Scanner(System.in);
		double f=sc.nextDouble();
		double c=(f-32)*(0.5555555556);
		System.out.println("Celsius : "+c);
	}
}
