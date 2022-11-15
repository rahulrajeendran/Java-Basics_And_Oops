package basicprograms;

import java.util.Scanner;

public class copyarray {
public static void main(String[] args) {
	System.out.println("Enter the limit ");
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	System.out.println("Enter the numbers ");
	int[] arr1=new int[limit];
	int[] arr2 =new int[limit];
	for(int i=0;i<limit;i++) {
		arr1[i]=sc.nextInt();
		arr2[i]=arr1[i];
//		System.out.println(arr1[i]);
	}
	for(int i=0;i<limit;i++) {
		System.out.println(arr2[i]);
	}
}
}
