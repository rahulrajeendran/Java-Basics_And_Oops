package prime;

import java.util.Scanner;

public class prime {
	prime(){
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("not prime");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("It is prime.");
		}
	}
}
