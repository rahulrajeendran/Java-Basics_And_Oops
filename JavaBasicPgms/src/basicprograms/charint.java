package basicprograms;

import java.util.Scanner;

public class charint {
public static void main(String[] args) {
	System.out.println("Enter the charecter ");
	Scanner ab=new Scanner(System.in);
	char a=ab.next().charAt(0);
	int c=(int)a;
	System.out.println("Charecter of given number is : "+c);
}
}
