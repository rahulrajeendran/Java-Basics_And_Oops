import java.util.Scanner;

public class arraySub {
	public static int[][] getArray(int[][] array,int size){
		System.out.println("Enter the values ");
		Scanner b=new Scanner(System.in);
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				array[i][j]=b.nextInt();
			}
		}
		return array;
	}
	void displayArray(int[][] array,int size) {
		System.out.println("The array is ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
