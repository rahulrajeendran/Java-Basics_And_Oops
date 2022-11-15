package amperfac;

import java.util.Scanner;

public class Amstrong {
	Amstrong(){
		System.out.println("Enter the number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,c=0,n2=num;
		int n=num;
		while(n!=0) {
			n=n/10;
			c++;
		}
		for(int i=0;i<c;i++) {
			sum=sum+((n2%10)*(n2%10)*(n2%10));
			n2=n2/10;
		}
		if(sum==num) {
			System.out.println("Amstrong");
		}else {
			System.out.println("not amstrong.");
		}
	}
}
