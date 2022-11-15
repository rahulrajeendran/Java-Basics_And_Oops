package objectArea;

import java.util.Scanner;

public class MyClass extends Area {
	public static void main(String[] args) {
		System.out.println("Enter your choice\n1.Circle\n2.Square\n3.Rectangle\n4.Triangle\n");
		Scanner bb=new Scanner(System.in);
		int choice=bb.nextInt();
		switch(choice) {
		case 1:
			circle();
		case 2:
			square();
		case 3:
			rectangle();
		case 4:
			triangle();
			
		}
	}
	    public static void circle() {
		double area=circle1();
		System.out.println("Area : "+area);
        }
	
	    public static void square() {
		double area=square1();
		System.out.println("Area : "+area);
	    }
	    public static void rectangle() {
		double area=rectangle1();
		System.out.println("Area : "+area);
	    }
	    public static void triangle() {
		double area=triangle1();
		System.out.println("Area : "+area);
	    }

}
