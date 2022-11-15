 package objectArea;

import java.util.Scanner;

public class Area {
	public static double circle1() {
		System.out.println("Enter the radius ");
		Scanner ab=new Scanner(System.in);
		double radius=ab.nextDouble();
		double area=3.14*(radius*radius);
		return area;
	    }
	
	public static double square1() {
		System.out.println("Enter the length ");
		Scanner ab=new Scanner(System.in);
		double length=ab.nextDouble();
		double area=length*length;
		return area;
     	}
	public static double rectangle1() {
		System.out.println("Enter length and width ");
		Scanner ab=new Scanner(System.in);
		double length=ab.nextDouble();
		double width=ab.nextDouble();
		double area=length*width;
		return area;
	    }
	public static double triangle1() {
		System.out.println("Enter breadth and height ");
		Scanner ab=new Scanner(System.in);
		double breadth=ab.nextDouble();
		double height=ab.nextDouble();
		double area=breadth*height;
		return area;
	    }
}
