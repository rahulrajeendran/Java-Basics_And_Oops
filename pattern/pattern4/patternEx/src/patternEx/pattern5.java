package patternEx;

import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args) {
		System.out.println("Enter the limit ");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		for(int i=1;i<=limit;i++){
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int k=1;k<limit;k++) {
			int b=1;
			for(int l=limit-1;l>=k;l--) {
				System.out.print(b);
				b++;
			}
			System.out.println();
		}
	}

}
