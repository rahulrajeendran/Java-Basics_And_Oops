package pattern;

import java.util.Scanner;

public class patternPrint {
	public static void main(String[] args) {
		System.out.println("Enter the limit ");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		int a=1;
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a=a+1;
			}
			System.out.println();
		}
	}
		

}
