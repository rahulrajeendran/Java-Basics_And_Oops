package basicprograms;

import java.util.Scanner;

public class frequencyeach {
	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		System.out.println("Enter the numbers ");
		int[] arr=new int[limit+1];
		for(int i=0;i<limit;i++) {
			 arr[i]=sc.nextInt();
			 }
		for(int i=0;i<limit;i++) {
			int fr=1;
			for(int j=0;j<limit;j++) {
				if(arr[i]==arr[j]&&i!=j) {
					fr++;
					for(int k=j;k<limit;k++) {
						arr[k]=arr[k+1];
					}
					j--;
					limit--;
				}
			}
			System.out.println("frequency of "+arr[i]+" is : " +fr);
		}
	}
}
