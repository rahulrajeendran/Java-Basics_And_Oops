package identitymatrix;

import java.util.Scanner;

public class identity {
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
void check(int[][] arr1,int l) {
	int flag=0;
	for(int i=0;i<l;i++) {
		for(int j=0;j<l;j++) {
			if(i==j&&arr1[i][j]!=1) {
				System.out.println("Not identity.");
				flag=1;
				break;
			}
			else if(arr1[i][j]!=0&&i!=j) {
				System.out.println("Not a identity.");
				flag=1;
				break;
			}
	    }
		if(flag==1) {
			break;
		}
    }
	if(flag==0) {
		System.out.println("Identity matrix...");
	}
}
}
