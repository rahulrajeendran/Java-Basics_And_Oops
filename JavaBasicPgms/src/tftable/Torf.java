package tftable;

import java.util.Scanner;

public class Torf {
	public static void main(String[] args) {
		Torf obj=new Torf();
//		int[] ar=obj.print();
//		for(i=0;i<)
		obj.print();
	}
	void print() {
		System.out.println("Enter the limit ");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		int[] arr=new int[limit];
		for(int i=0;i<limit;i++) {
			System.out.println("\n Enter the combo;");
			int a=sc.nextInt();
			System.out.println("Enter the operation,\n 1 for and,\n 2 for or,\n3 for xor,\n4 for not");
			int c=sc.nextInt();
//			System.out.println("");
			switch(c) {
			case 1:
				System.out.println("P \t  Q  \t  AND  \t OR  \t XOR  \t  NOT \n");
				System.out.print((a/10) +"\t"  +(a%10)   +"\t"  );
				a=(a/10)&(a%10);
				arr[i]=a;
				System.out.print(" "+a);
				break;
			case 2:
				System.out.println("P \t  Q  \t  AND  \t OR  \t XOR  \t  NOT \n");
				System.out.print((a/10) +"\t"  +(a%10)   +"\t"  );
				a=(a/10)|(a%10);
				arr[i]=a;
				System.out.print("\t  "+a);
				break;
			case 3:
				System.out.println("P \t  Q  \t  AND  \t OR  \t XOR  \t  NOT \n");
				System.out.print((a/10) +"\t"  +(a%10)   +"\t"  );
				a=(a/10)^(a%10);
				arr[i]=a;
				System.out.print("\t  \t  "+a);
				break;
			case 4:
				System.out.println("P \t  Q  \t  AND  \t OR  \t XOR  \t  NOT \n");
				System.out.print((a/10) +"\t"  +(a%10)   +"\t"  );
				a=(a/10);
				arr[i]=a;
				System.out.print("\t  \t  \t  "+a); 
				break;
			default:
				System.out.println("not valid");
			}
		}
//		return arr;
	}
}
