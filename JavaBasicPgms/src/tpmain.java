import java.util.Scanner;

public class tpmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size=sc.nextInt();
		transpose obj=new transpose();
		int[][] arr=obj.matrix(size);
		int[][] arr2=obj.transp(arr, size);
		System.out.println("Entered matrix is :");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
		System.out.println("Transposed matrix is :");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println("");
		}
	}

}
