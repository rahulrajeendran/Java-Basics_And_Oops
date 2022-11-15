package matrixadd;

import java.util.Scanner;

public class array2d {
	Scanner sc=new Scanner(System.in);
void array() {
	System.out.println("Enter the size");
	int size=sc.nextInt();
	int[][] arr=new int[size][size];
	int[][] arr2=new int[size][size];
	System.out.println("Enter the 1st matrix ");
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter the 2nd matrix");
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			arr2[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			arr[i][j]=arr[i][j]+arr2[i][j];
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println("");
	}
}
}
