package numberpattern;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int num=1;
		for(int i=0;i<n;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println("");
		}
//		Pyramid obj=new Pyramid();
//		obj.numpyramid(n);
		Trypy obj=new Trypy();
		obj.tryp();
	}
}
