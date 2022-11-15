package sumofrc;

import java.util.Scanner;

public class sum {
Scanner sc=new Scanner(System.in);
void rcsum() {
	System.out.println("Enter the size");
	int l=sc.nextInt();
	int[][] arr=new int[l][l];
	System.out.println("Enter the numbers");
	for(int i=0;i<l;i++) {
		for(int j=0;j<l;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<l;i++) {
		int rsum=0;
		int csum=0;
		for(int j=0;j<l;j++) {
			csum=csum+arr[i][j];
			rsum=rsum+arr[j][i];
		}
		System.out.println(i+"th row sum is : "+csum);
		System.out.println(i+"th column sum is : "+rsum);
	}
}
}
