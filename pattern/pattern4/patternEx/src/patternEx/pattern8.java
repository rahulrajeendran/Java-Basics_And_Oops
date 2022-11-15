package patternEx;

import java.util.Scanner;

public class pattern8 {
	public static void main(String[] args) {
		System.out.println("Enter the limit ");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		String[] names=new String[100];
		String str1=new String();
		String str2=new String();
		//String str3=new String();
		System.out.println("Enter the names ");
		for(int i=0;i<limit;i++) {
			names[i]=sc.nextLine();		
		}
		for(int j=0;j<limit;j++) {
			str1=names[j];
			str2=names[j+1];
			int res=str1.compareTo(str2);
			if(res>0) {
				names[j]=str2;
				names[j+1]=str1;
			}
		}
		
	}

}
