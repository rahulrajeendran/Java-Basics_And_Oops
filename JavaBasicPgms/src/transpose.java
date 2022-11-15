import java.util.Scanner;

public class transpose {
	Scanner sc=new Scanner(System.in);
int[][] matrix(int l) {
	System.out.println("Enter the numbers");
	int[][] arr=new int[l][l];
	for(int i=0;i<l;i++) {
		for(int j=0;j<l;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	return arr;
}
int[][] transp(int[][] ar,int l){
	int[][] arr2=new int[l][l];
	for(int i=0;i<l;i++) {
		for(int j=0;j<l;j++) {
			arr2[i][j]=ar[j][i];
		}
	}
	return arr2;
}
}
