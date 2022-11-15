package abstudent;

import java.util.Scanner;

public class Registration extends Abstractclass {
	void registration() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		String name=sc.next();
		System.out.println("Enter your address");
		String add=sc.next();
		System.out.println("Enter your contact num");
		String phno=sc.next();
		System.out.println("Enter your email id");
		String email=sc.next();
		System.out.println("Enter your proof type");
		String ptype=sc.next();
		System.out.println("Enter your proof id");
		String pid=sc.next();
		String[] str= {name,add,phno,email,ptype,pid};
		super.display(str, 6);
	}
}
