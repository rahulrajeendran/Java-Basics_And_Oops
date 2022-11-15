package patternEx;

import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args) {
		System.out.println("Enter the name");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int length=str.length();
		for(int i=0;i<=length;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}

}
