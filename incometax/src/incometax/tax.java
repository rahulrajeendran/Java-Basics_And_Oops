package incometax;

import java.util.Scanner;

public class tax {
	public static void main(String[] args) {
		System.out.println("Enter the annuel income ");
		Scanner ab=new Scanner(System.in);
		double income=ab.nextFloat();
		if(income>=1000000) {
			double tax=income*.3;
			System.out.println("income tax amount = "+tax);
		}
		else if(income>=500000) {
			double tax=income*.2;
			System.out.println("income tax amount = "+tax);
		}
		else if(income>=250000) {
			double tax=income*.05;
			System.out.println("income tax amount = "+tax);
		}
		else {
		   System.out.println("No tax");
		}
	}

}
