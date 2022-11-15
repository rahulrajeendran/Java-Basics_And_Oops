package basicprograms;

import java.util.Scanner;

public class largestinarray {
public static void main(String[] args) {
	System.out.println("Enter the limit");
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	System.out.println("Enter the numbers ");
	int[] arr=new int[limit];
	for(int i=0;i<limit;i++) {
		 arr[i]=sc.nextInt();
	}
	int large=0;
	for(int i=0;i<limit;i++) {
		if(arr[i]>large) {
			large=arr[i];
		}
	}
	System.out.println("largest is : "+large);
}
}
