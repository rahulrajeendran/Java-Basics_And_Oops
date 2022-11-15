package basicprograms;

import java.util.Scanner;

public class arrayprint {
public static void main(String[] args) {
	System.out.println("Enter the limit");
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	System.out.println("Enter the numbers ");
	int[] arr=new int[limit];
	for(int i=0;i<limit;i++) {
		 arr[i]=sc.nextInt();
	}
	System.out.println("numbers are :");
	for(int i=0;i<limit;i++) {
		System.out.println(arr[i]);
	}
}
}
