package leftarrowstar;

import java.util.Scanner;

public class Left {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1;j++) {
				System.out.print(" ");
			}
			for(int k=n;k>i;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
