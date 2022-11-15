package guest;

import java.util.Scanner;

public class Regmain {
	public static void main(String[] args) {
		Registration obj=new Registration();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		obj.setNum(sc.nextInt());
		System.out.println("Enter your name :");
		obj.setName(sc.next());
		System.out.println("Enter your Address :");
		obj.setAdd(sc.next());
		System.out.println("Enter your Contact num :");
		obj.setPno(sc.nextLong());
		System.out.println("Enter your email :");
		obj.setEmail(sc.next());
		System.out.println("Enter proof type :");
		obj.setPtype(sc.next());
		System.out.println("Enter your proof id :");
		obj.setPid(sc.nextLong());
		if(obj.check()) {
			System.out.println("Registration successful...!");
			System.out.println(" Number : \t"+obj.getNum()+"\n Name : \t"+obj.getName()+"\n Address : \t"+obj.getAdd()+"\n Ph.no : \t"+obj.getPno()+"\n email : \t"+obj.getEmail()+"\n Proof type : \t"+obj.getPtype()+"\n Proof id : \t"+obj.getPid());
		}
		else {
			System.out.println("Unsuccessful.");
		}
	}

}
