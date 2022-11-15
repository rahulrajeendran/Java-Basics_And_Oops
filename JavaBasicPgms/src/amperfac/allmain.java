package amperfac;

import java.util.Scanner;

public class allmain {
	public static void main(String[] args) {
		Amstrong obj=new Amstrong();
		Perfact obj1=new Perfact();
		System.out.println("Enter the number to Find factorial");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res=obj1.fact(num);
		System.out.println("factorial is : "+res);
	}

}
