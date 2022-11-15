package diamond;

import java.util.Scanner;

public class Diamondpattern {
	public static void main(String[] args) {
		System.out.println("Enter the limit ");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		for(int i=1;i<l+1;i++) {
			for(int j=l;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=l-1;i>0;i--) {
			for(int j=0;j<l-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(2*i)-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
