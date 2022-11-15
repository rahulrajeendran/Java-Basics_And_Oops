package oddandevenarray;

import java.util.Scanner;

public class oddeven {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	int limit=sc.nextInt();
	System.out.println("Enter the numbers ");
	int[] ar=new int[limit];
	for(int i=0;i<limit;i++) {
		ar[i]=sc.nextInt();
	}
	oeprint obj=new oeprint();
	obj.even(ar, limit);
	obj.odd(ar, limit);
}
}
