package fibonacci;

import java.util.Scanner;

public class fibon {
	    fibon() {
		System.out.println("enter the limit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.print(a+"\t"+b);
		for(int i=0;i<=n;i++) {
			b=a+b;
			a=b-a;
			System.out.print("\t"+b);
		}
	}
}
