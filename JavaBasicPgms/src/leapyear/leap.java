package leapyear;

import java.util.Scanner;

public class leap {
 Scanner sc=new Scanner(System.in);
 void lpyear() {
	 System.out.println("enter the year");
	 int yr=sc.nextInt();
	 if(yr%4==0 && yr%100!=0 || yr%400==0) {
		 System.out.println("It's a leap year..");
	 }
	 else {
		 System.out.println("Not a leap year.");
	 }
 }
}
