import java.util.Scanner;

public class addition {
	public static void main(String[] args) {
		System.out.println("Enter the size of the array ");
		Scanner d=new Scanner(System.in);
		int size=d.nextInt();
		subClass obj1=new subClass();
		int[][] array=new int[100][100];
		int[][] storage1=obj1.getArray(size,array);
		int[][] storage2=obj1.getArray(size, array);
		int[][] storage3=obj1.addArray(size,storage1,storage2);
		obj1.displayArray(size,storage3);
	}

}
