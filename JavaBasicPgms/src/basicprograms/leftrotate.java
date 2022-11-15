package basicprograms;

import java.util.Scanner;

public class leftrotate {
public static void main(String[] args) {
	System.out.println("Enter the limit");
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	System.out.println("Enter the numbers ");
	int[] arr=new int[limit];
	for(int i=0;i<limit;i++) {
		 arr[i]=sc.nextInt();
	}
	int[] arr2=new int[limit];
	int ab=0;
	for(int i=limit-1;i>=0;i--) {
		arr2[ab]=arr[i];
		ab++;
	}
	for(int i=0;i<limit;i++) {
		 System.out.println(arr2[i]);
	}
}
}
