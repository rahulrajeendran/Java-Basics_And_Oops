package overloading;

import java.util.Scanner;

public class Shopping {
	void shope(){
		Shopping obj=new Shopping();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Gents \t 2.Ladies \t 3.Kids");
		if(sc.nextInt()==1) {
			System.out.println("Gents Wear \n 1.Jeans \t 2.Shirt \t 3.tshirt");
			int tp=sc.nextInt();
			System.out.println("Enter Quantity");
			int qt=sc.nextInt();
			obj.display(tp, qt);
		}
		else if(sc.nextInt()==2) {
			System.out.println("Ladies Wear \n 1.Churidar \\t 2.Saree \\t 3.Legins");
			float tp=sc.nextFloat();
			System.out.println("Enter Quantity");
			int qt=sc.nextInt();
			obj.display(tp, qt);
		}
		else if(sc.nextInt()==3){
			System.out.println("Kids Wear \n 1.shirt \t 2.pant \t 3.tshirt");
			double tp=sc.nextDouble();
			System.out.println("Enter Quantity");
			int qt=sc.nextInt();
			obj.display(tp, qt);
		}
		else {
			System.out.println("Invalid option");
		}
	}
	void display(int tp,int qty) {
		if(tp==1) {
			System.out.println("Total amount is : "+990*qty);
		}
		else if(tp==2) {
			System.out.println("Total amount is : "+1200*qty);
		}
		else if(tp==3){
			System.out.println("Total amount is : "+600*qty);
		}
		else {
			System.out.println("Invalid option.");
		}
	}
	void display(float tp,int qty) {
		if(tp==1) {
			System.out.println("Total amount is : "+700*qty);
		}
		else if(tp==2) {
			System.out.println("Total amount is : "+1000*qty);
		}
		else if(tp==3){
			System.out.println("Total amount is : "+500*qty);
		}
		else {
			System.out.println("Invalid option.");
		}
	}
	void display(double tp,int qty) {
		if(tp==1) {
			System.out.println("Total amount is : "+1000*qty);
		}
		else if(tp==2) {
			System.out.println("Total amount is : "+1300*qty);
		}
		else if(tp==3){
			System.out.println("Total amount is : "+200*qty);
		}
		else {
			System.out.println("Invalid option.");
		}
	}
}
