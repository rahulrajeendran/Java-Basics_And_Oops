package classprogram;

import java.util.Scanner;

public class arrayduplicate {
public static void remove() {
	System.out.println("Enter the limit");
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	System.out.println("Enter the values ");
	int[] arr=new int[limit+1];
	for(int i=0;i<limit;i++) {
		arr[i]=sc.nextInt();
	}
//	int[] arr2=new int[limit];
	for(int i=0;i<limit;i++) {
		for(int j=0;j<limit;j++) {
			if(arr[i]==arr[j]&&i!=j) {
				for(int k=j;k<limit;k++) {
					arr[k]=arr[k+1];
				}
				limit=limit-1;
			}
		}
	}
	for(int i=0;i<limit;i++) {
		System.out.print(arr[i]);
	}
}
}
