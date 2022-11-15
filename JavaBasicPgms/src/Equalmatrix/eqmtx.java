package Equalmatrix;

import java.util.Scanner;

public class eqmtx {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=sc.nextInt();
	int[][] arr1=new int[size][size];
	int[][] arr2=new int[size][size];
	equal obj=new equal();
	arr1=obj.create(size);
	arr2=obj.create(size);
	obj.check(arr1, arr2, size);
}
}
