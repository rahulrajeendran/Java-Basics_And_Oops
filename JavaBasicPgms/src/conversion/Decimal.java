package conversion;

import java.util.Scanner;

public class Decimal {
	Scanner sc=new Scanner(System.in);
	void binary() {
		System.out.println("Enter the number ");
		int deci=sc.nextInt();
		int i=0;
		hexa(deci);
		octa(deci);
		int[] arr=new int[100];
		while(deci!=0) {
			arr[i]=deci%2;
			deci=deci/2;
			i++;
		}
		System.out.print("\n Binary is : ");
		for(int j=i-1;j>=0;j--) {
			System.out.print(arr[j]);
		}
//		while(i>0) {
//			System.out.print(arr[i]);
//			i--;
//		}
	}
	void hexa(int num) {
		int i=0;
		int[] arr=new int[100];
		while(num!=0) {
			arr[i]=num%16;
			num=num/16;
			i++;
		}
		System.out.print("\n Hexadecimal is : ");
		for(int j=i-1;j>=0;j--) {
			if(arr[j]<10) {
				System.out.print(arr[j]);
			}else {
				if(arr[j]==10) {
					System.out.print("A");
				}
				else if(arr[j]==11) {
					System.out.print("B");
				}
				else if(arr[j]==12) {
					System.out.print("C");
				}
				else if(arr[j]==13) {
					System.out.print("D");
				}
				else if(arr[j]==14) {
					System.out.print("E");
				}
				else if(arr[j]==15) {
					System.out.print("F");
				}
			}
		}
	}
	
	void octa(int num) {
		int i=0;
		int[] arr=new int[100];
		while(num!=0) {
			arr[i]=num%8;
			num=num/8;
			i++;
		}
		System.out.print("\n Octal is : ");
		for(int j=i-1;j>=0;j--) {
			System.out.print(arr[j]);
		}
	}

}
