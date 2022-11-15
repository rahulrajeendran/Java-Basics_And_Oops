package patternEx;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		System.out.println("Enter the limit ");
		Scanner ab=new Scanner(System.in);
		int limit=ab.nextInt();
		int c=0;
		for(int i=1;i<=3;i++) {
			for(int k=0;k<i;k++) {
			for(int j=0;j<i*2;j++) {
				System.out.print("*");
			    }
			System.out.println();
		    }
			//System.out.println();
			c++;
			if(c<limit) {
				System.out.println("*");
				System.out.println("*");
				System.out.println("*");
			}
		}
	}

}
