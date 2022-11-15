package patternEx;

import java.util.Scanner;

public class pattern9 {
	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		int c=0;
		int array[]=new int[limit+10];
		System.out.println("Enter the values ");
		for(int i=0;i<limit;i++) {
			array[i]=sc.nextInt();
		}
		for(int j=0;j<limit;j++) {
			if(array[j]%2==0) {
				for(int k=j;k<limit;k++) {
			    array[k]=array[k+1];
				}
				c++;
			}
		}
		for(int k=0;k<c;k++) {
			System.out.print(array[k]+" ");
		}
	}

}
