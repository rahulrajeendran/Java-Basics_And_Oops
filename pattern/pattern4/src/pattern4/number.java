package pattern4;

import java.util.Scanner;

public class number {
	public static void main(String[] args) {
		System.out.println("Enter the limit ");
		Scanner ab=new Scanner(System.in);
		int limit=ab.nextInt();
		int n=limit;
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++) {
				System.out.print(i*k+" ");
			}
			n=n-1;
			System.out.println();
		}
	}

}
