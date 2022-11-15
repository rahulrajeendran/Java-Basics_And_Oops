package identitymatrix;

import java.util.Scanner;

public class idmatrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=sc.nextInt();
	int[][] ar1=new int[size][size];
	int[][] ar2=new int[size][size];
	identity obj1=new identity();
	ar1=obj1.create(size);
//	ar2=obj1.create(size);
	obj1.check(ar1, size);
}
}
