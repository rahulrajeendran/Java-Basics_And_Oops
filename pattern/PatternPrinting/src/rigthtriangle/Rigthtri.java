package rigthtriangle;

import java.util.Scanner;

public class Rigthtri {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the symbol");
		String str=sc.next();
		for(int i=1;i<n+1;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(str);
			}
			System.out.println("");
		}
	}
}
