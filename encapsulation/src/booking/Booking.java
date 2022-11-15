package booking;

import java.util.Scanner;

public class Booking {
	public static void main(String[] args) {
		Trainticket obj=new Trainticket();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Price of ticket : ");
		obj.setPrice(sc.nextLong());
		System.out.println("Enter the number of Persons : ");
		obj.setNop(sc.nextInt());
		char[] gen=new char[obj.getNop()];
		String[] str=new String[obj.getNop()];
		int[] age=new int[obj.getNop()];
		for(int i=1;i<=obj.getNop();i++) {
			System.out.println("Enter the details for person "+i+" : ");
			str[i-1]=sc.next();
			System.out.println("Gender (M or F) :");
			gen[i-1]=sc.next().charAt(0);
			System.out.println("Age : ");
			age[i-1]=sc.nextInt();
		}
		long total=(obj.getNop())*(obj.getPrie());
		System.out.println("Ticket details are  \n No.of Passengers : \t"+obj.getNop()+"\n Price of ticket : \t"+obj.getPrie()+"\n Total amount : \t"+total);
	}

}
