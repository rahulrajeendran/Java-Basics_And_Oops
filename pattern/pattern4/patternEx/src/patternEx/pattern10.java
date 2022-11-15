package patternEx;

import java.util.Scanner;

public class pattern10 {
	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		int c=0;
		int array[]=new int[limit+10];
		int array2[]=new int[limit+10];
		System.out.println("Enter the values ");
		for(int i=0;i<limit;i++) {
			array[i]=sc.nextInt();
		}
		for(int j=0;j<limit;j++) {
			for(int i=2;i<=array[j]/2;i++) {
				if(array[j]%i==0) {
					array2[c]=array[j];
					c++;
					break;
				}
			}
		}
		for(int k=0;k<c;k++) {
			System.out.print(array2[k]+" ");
		}
	}

}
