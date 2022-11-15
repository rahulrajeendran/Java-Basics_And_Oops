package numberpattern;

import java.util.Scanner;

public class Inctri {
	public static void main(String[] args) {
		System.out.println("enter size ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
