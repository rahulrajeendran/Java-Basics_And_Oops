package telcurbill;

import java.util.Scanner;

public class Bill extends Currentbill{
	int bill(){
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter current bill id");
		int id=sc.nextInt();
		return id;
	}
	Bill(){
		Telephonebill obj2=new Telephonebill();
	}
}
