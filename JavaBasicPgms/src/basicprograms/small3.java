package basicprograms;

import java.util.Scanner;

public class small3 {
public static void main(String[] args) {
	Scanner ab=new Scanner(System.in);
	System.out.println("enter the numbers ");
	int a=ab.nextInt();
	int b=ab.nextInt();
	int c=ab.nextInt();
	int smallest=(a<b)?(a<c?a:c):(b<c?b:c);
	System.out.println("Smallest is : "+smallest);
}
}
