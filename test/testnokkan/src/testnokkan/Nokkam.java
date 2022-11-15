package testnokkan;

import java.util.Scanner;

public class Nokkam {
	public static void main(String[] args) {
		System.out.println("Enter the limit ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the values ");
		int[] a=new int[1000];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int c=1;
		int b=0;
		for(int i=1;i<=3;i++) {				
			for(int j=1;j<=i*2;j++) {
				System.out.print(a[b]+" ");
				if(a[b]%2!=0) {
					b=b+3;
				}
				else {
					b=b+1;
				}
			}
			System.out.println();
			int d=3*i;
			if(a[b]%2!=0) {
				System.out.println(a[b]);
				b=b+3;
				d=d-1;
			}
			if(c<3) {
			for(int k=1;k<=d;k++) {
				System.out.println(a[b]);
				if(a[b]%2!=0) {
					b=b+3;
				}
				else {
					b=b+1;
				}
			}
		   }
			c++;
		}
			
	} 

}
