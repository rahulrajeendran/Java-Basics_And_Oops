import java.util.Scanner;

public class subClass {
	
	public static int[][] getArray(int limit,int[][] array){
		System.out.println("Enter the values ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<limit;i++) {
			for(int j=0;j<limit;j++) {
			  array[i][j]=sc.nextInt();
			}
		}
		return array;
	}
	
	public static int[][] addArray(int size,int[][] array1,int[][] array2){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				array1[i][j]=array1[i][j]+array2[i][j];
			}
		}
		return array1;
	}
	void displayArray(int size,int[][] array3) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(array3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
