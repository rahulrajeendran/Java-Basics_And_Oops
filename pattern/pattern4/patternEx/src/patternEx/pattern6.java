package patternEx;

import java.util.Scanner;

public class pattern6 {
	public static void main(String[] args) {
		System.out.println("Enter the limit ");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		for(int i=0;i<limit;i++) {
			for(int j=limit;j>i;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			if(i<limit-1) {
			for(int k=0;k<2*i-1;k++) {
				System.out.print(" ");
			}
			if(i>0) {
				System.out.print("*");
			}
			}
			else if(i==limit-1) {
				for(int l=0;l<(limit-1)*2;l++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
