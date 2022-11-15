package aas;

import java.util.Scanner;

public class Operation {
	Scanner sc=new Scanner(System.in);
	void addition() {
		System.out.println("enter the values");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("the result is : "+sum);
	}
	void subtraction() {
		System.out.println("enter the values");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result=num1-num2;
		System.out.println("The result is : "+result);
	}
	void multiplication() {
		System.out.println("enter the values");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		double pdt=num1*num2;
		System.out.println("the result is : "+pdt);
	}
	void division() {
		System.out.println("enter the values ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int quotient=num1/num2;
		System.out.println("the result is : "+quotient);
	}

}
