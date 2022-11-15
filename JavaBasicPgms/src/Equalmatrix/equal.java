package Equalmatrix;

import java.util.Scanner;

public class equal {
	Scanner sc=new Scanner(System.in);
int[][] create(int l){
	int[][] arr=new int[l][l];
	System.out.println("Enter the Elements");
	for(int i=0;i<l;i++) {
		for(int j=0;j<l;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	return arr;
}
void display(int l,int[][] arr) {
	for(int i=0;i<l;i++) {
		for(int j=0;j<l;j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println("");
	}
}
void check(int[][] arr1,int[][] arr2,int l) {
	int flag=0;
	for(int i=0;i<l;i++) {
		for(int j=0;j<l;j++) {
			if(arr1[i][j]!=arr2[i][j]) {
				System.out.println("Not Equal");
				flag=1;
				break;
			}
		}
		if(flag==1) {
			break;
		}
	}
	if(flag==0) {
		System.out.println("Marices are equal..");
	}
}
}
