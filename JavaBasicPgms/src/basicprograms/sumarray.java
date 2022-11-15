package basicprograms;

import java.util.Scanner;

public class sumarray {
public static void main(String[] args) {
	System.out.println("Enter the limit of the array ");
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	System.out.println("Enter 1st array numbers ");
	int[] array1=new int[limit];
	for(int i=0;i<limit;i++) {
		array1[i]=sc.nextInt();
	}
	System.out.println("Enter the 2nd array numbers ");
	int[] array2=new int[limit];
	for(int i=0;i<limit;i++) {
		array2[i]=sc.nextInt();
	}
	for(int i=0;i<limit;i++) {
		array1[i]=array1[i]+array2[i];
		System.out.println(array1[i]);
	}
}
}
