package test;

import java.util.Scanner;

public class sample {
//33,32,58,60,15,1
	public static void main(String[] args) {
		System.out.println("Enter the array size");
		Scanner b=new Scanner(System.in);
		int size=b.nextInt();
		System.out.println("Enter the values ");
		int[] array=new int[100];
		int j;
		int temp;
		for(int i=0;i<size;i++) {
			array[i]=b.nextInt();
		}
		for(int i=0;i<size-1;i++) {
			for(j=i+1;j<size;j++) {
				if(array[j]<array[j+1]) {
				 temp=array[j];
				}
				else {
					temp=array[j+1];
				}
			}
			int temp2=array[i];
			array[i]=temp;
			array[j]=temp2;
		}
		for(int i=0;i<size;i++) {
			System.out.println(array[i]+" ");
		}
	}
}
