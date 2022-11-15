package cross;

import java.util.Scanner;

public class Xmark {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || j==(n-(i+1))) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}
