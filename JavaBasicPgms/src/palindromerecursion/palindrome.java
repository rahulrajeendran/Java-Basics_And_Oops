package palindromerecursion;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int l=str.length();
		if(pal(str,0,l-1)) {
			System.out.println("It is palindrome.");
		}else {
			System.out.println("Not palindrome.");
		}
	}
	public static boolean pal(String st,int a,int n) {
		if(st.charAt(a)!=st.charAt(n)) {
			return false;
		}
		else if(a==n) {
			return true;
		}
		else if(a>n) {
			return true;
		}
		else {
			return (pal(st,a+1,n-1));
		}
	}
}
