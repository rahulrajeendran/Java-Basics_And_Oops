package basicprograms;

import java.util.Scanner;

public class intchar {
public static void main(String[] args) {
	System.out.println("Enter the number ");
	Scanner ab=new Scanner(System.in);
	int a=ab.nextInt();
	char c=(char)a;
	System.out.println("Charecter of given number is : "+c);
}
}
