package basicprograms;

import java.util.Scanner;

public class greatest3 {
public static void main(String[] args) {
	System.out.println("enter the three numbers");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int largest=(a>b)?(a>c?a:c):(b>c?b:c);
	System.out.println("Largest number is : "+largest);
}
}
