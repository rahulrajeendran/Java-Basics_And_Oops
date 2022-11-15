package telcurbill;

import java.util.Scanner;

public class Billmain {
	Telephonebill obj3;
	public static void main(String[] args) {
		Bill obj=new Bill();
		int n=obj.bill();
		obj.dis(n);
	}
	Billmain(Telephonebill obj3){
		this.obj3=obj3;
		System.out.println("enter telephone id");
		Scanner sc=new Scanner(System.in);
		obj3.display(sc.nextInt());
	}
}
