package patternEx;

import java.util.Scanner;

public class pattern4 {
	public static void main(String[] args) {
		System.out.println("Enter the limit ");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		for(int i=0;i<limit;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=limit;k>i;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
