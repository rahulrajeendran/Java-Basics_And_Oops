package numberpattern;

import java.util.Scanner;

public class Trypy {
	void tryp() {
		System.out.println("Enter size");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		for(int i=1;i<=l;i++) {
			for(int j=l;j>i;j--) {
				System.out.print(" ");
			}
			int temp=1;
			for(int j=1;j<=i;j++) {
				System.out.print(temp+" ");
				temp=temp*(i-j)/(j);
			}
			System.out.println("");
		}
	}
}
