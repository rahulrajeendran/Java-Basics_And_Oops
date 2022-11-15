package arraymul;

import java.util.Scanner;

public class multipli {
	public static void main(String[] args) {
	  System.out.println("Enter the size of the array ");
	  Scanner b=new Scanner(System.in);
	  int size=b.nextInt();
	  System.out.println("Enter the values ");
	  int[] array=new int[100];
	  for(int i=0;i<size;i++) {
		   array[i]=b.nextInt();
	  }
	  int[] array2=new int[100];
	   for(int i=0;i<size-1;i++) {
		   array2[i]=array[i]*array[i+1];
	   }
	   System.out.println("Result : ");
	   for(int i=0;i<size-1;i++) {
	   System.out.println(array2[i]);
	   }
	}

}
