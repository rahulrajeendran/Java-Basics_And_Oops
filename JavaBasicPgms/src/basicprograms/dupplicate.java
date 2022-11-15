package basicprograms;

import java.util.Scanner;

public class dupplicate {
public static void main(String[] args) {
	System.out.println("Enter the limit");
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	System.out.println("Enter the numbers ");
	int[] arr=new int[limit];
	for(int i=0;i<limit;i++) {
		 arr[i]=sc.nextInt();
	}
	for(int i=0;i<limit;i++) {
		for(int j=0;j<limit;j++) {
			if(arr[i]==arr[j] && i!=j) {
				System.out.println("Duplicate :"+arr[i]);
				break;
			}
		}
	}
}
}
