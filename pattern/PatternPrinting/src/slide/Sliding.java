package slide;

import java.util.Scanner;

public class Sliding {
	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter symbol ");
		String str=sc.next();
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<n;k++) {
				System.out.print(str);
			}
			System.out.println("");
		}
	}

}
