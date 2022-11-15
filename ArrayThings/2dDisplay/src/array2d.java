import java.util.Scanner;

public class array2d {
	public static void main(String[] args) {
		int[][] array=new int[100][100];
		System.out.println("Enter the size ");
		Scanner b=new Scanner(System.in);
		int size=b.nextInt();
		arraySub obj=new arraySub();
		int[][] store=obj.getArray(array,size);
		obj.displayArray(store, size);
	}

}
