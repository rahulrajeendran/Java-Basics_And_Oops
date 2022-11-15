package arrayPattern;

import java.util.Scanner;

public class arrayPattern {
		 public static void main(String[] args) {
			System.out.println("Enter the limit ");
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			/*System.out.println("Enter the values ");
			int[] a=new int[100];
			for(int i=0;i<size;i++) {
				a[i]=sc.nextInt();
			}*/
			int c=1;
			for(int i=1;i<=size;i++) {				
				for(int j=1;j<=i*2;j++) {
					System.out.print("*");
				}
				System.out.println();
				if(c<size) {
				for(int k=1;k<=3*i;k++) {
					System.out.println("*");
				}
			   }
				c++;
			}
				
		} 

}
