package basicprograms;

import java.util.Scanner;

public class sumofevenarray {
public static void main(String[] args) {
	System.out.println("Enter the limit ");
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	int[] arr=new int[limit];
	System.out.println("Enyter the numbers :");
	int sum=0;
	for(int i=0;i<limit;i++) {
		arr[i]=sc.nextInt();
		if(arr[i]%2==0) {
			sum=sum+arr[i];
		}
	}
	System.out.println("Sum of even numbers in the array is : "+sum);
}
}
