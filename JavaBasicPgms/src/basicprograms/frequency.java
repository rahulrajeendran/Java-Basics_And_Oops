package basicprograms;

import java.util.Scanner;

public class frequency {
public static void main(String[] args) {
	System.out.println("Enter the limit");
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	System.out.println("Enter the numbers ");
	int[] arr=new int[limit];
	for(int i=0;i<limit;i++) {
		 arr[i]=sc.nextInt();
	}
	System.out.println("Enter the number to check freqency ");
	int f=sc.nextInt();
	int fr=0;
	for(int i=0;i<limit;i++) {
		 if(arr[i]==f) {
			 fr++;
		 }
	}
	if(fr==0) {
		System.out.println("number not present ");
	}
	System.out.println("frequency is : "+fr);
}
}
