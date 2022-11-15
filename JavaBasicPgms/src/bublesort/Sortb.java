package bublesort;

import java.util.Scanner;

public class Sortb {
	public static void main(String[] args) {
		System.out.println("enter the length");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		System.out.println("Enter the numbers ");
		int[] arr=new int[l];
		for(int i=0;i<l;i++) {
			arr[i]=sc.nextInt();
		}
		Sortb obj=new Sortb();
		int[] ar2=obj.sort(arr,l);
		for(int i=0;i<l;i++) {
			System.out.println(ar2[i]);
		}
	}
	int[] sort(int[] ar,int lm) {
		for(int i=0;i<lm-1;i++) {
			for(int j=0;j<lm-1;j++) {
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		return ar;
	}
}
