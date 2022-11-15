package grading;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	System.out.println("Enter the mark scored by the student ");
	Scanner fb=new Scanner(System.in);
	float wmark=fb.nextFloat();
	float labmark=fb.nextFloat();
	float assignment=fb.nextFloat();
	float grade=((wmark*70)+(labmark*20)+(assignment*10))/100;
	System.out.println("Grade of the student is : "+grade);
	
}
}
