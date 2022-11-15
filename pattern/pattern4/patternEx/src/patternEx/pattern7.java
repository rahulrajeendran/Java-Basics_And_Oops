package patternEx;

import java.util.Scanner;

public class pattern7 {
	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=n-1;
		//int c=b*(-1);
		for(int i=0;i<=2*b;i++) {
			for(int j=0;j<=2*b;j++) {
				if(i==b|j==b|i+j==b|i-j==b|j-i==b|i+j==12) {
					System.out.print("*");
				}
				/*else if(i+j==c) {
					System.out.print("*");
				}*/
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
