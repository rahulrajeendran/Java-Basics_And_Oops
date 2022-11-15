package aas;

import java.util.Scanner;

public class New {
	public static void main(String[] args) {
		System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.division\nEnter your choice ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		Operation b=new Operation();
		switch(choice) {
		case 1: 
			b.addition();
			break;
		case 2:
			b.subtraction();
			break;
		case 3:
			b.multiplication();
			break;
		case 4:
			b.division();
			break;
		default :
			System.out.println("Invalid");
			
			
		}
		
	}

}
