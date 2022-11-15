package amperfac;

import java.util.Scanner;

public class Perfact {
	Scanner sc=new Scanner(System.in);
	Perfact() {
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int[] arr=new int[150];
		int a=0,sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				arr[a]=i;
				a++;
			}
		}
		while(a>=0) {
			sum=sum+arr[a];
			a--;
		}
		if(sum==num) {
			System.out.println("It is a perfect number");
		}else {
			System.out.println("Not a perfect number.");
		}
	}
	int fact(int n) {
		int sum=n;
		if(n==0) {
			return 1;
		}
		else {
			sum=sum*fact(n-1);
			return sum;
		}
	}
}
