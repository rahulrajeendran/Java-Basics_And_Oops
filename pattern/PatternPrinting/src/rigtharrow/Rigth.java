package rigtharrow;

import java.util.Scanner;

public class Rigth {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit ");
		int n=sc.nextInt();
		System.out.println("Enter the symbol");
		String str=sc.next();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("  ");
			}
			for(int k=n;k>i;k--) {
				System.out.print(str);
			}
			System.out.println("");
		}
		for(int i=1;i<n;i++) {
			for(int k=n-1;k>i;k--) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(str);
			}
			System.out.println("");
		}
		
	}

}
