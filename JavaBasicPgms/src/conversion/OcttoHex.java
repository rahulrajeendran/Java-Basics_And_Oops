package conversion;

import java.util.Scanner;

public class OcttoHex {
	void otoh() {
		System.out.println("Enter the Octal number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=num,c=0,sum=0;
		while(n!=0) {
			c++;
			n=n/10;
		}
		for(int i=0;i<c;i++) {
			int a = 1;
			for(int j=i;j>=0;j--) {
				if(j==0) {
					a=a;
				}else {
					a=a*8;
				}
			}
			sum=sum+((num%10)*a);
			System.out.println(sum);
			num=num/10;
		}
		int i=0;
		int[] arr=new int[100];
		while(sum!=0) {
			arr[i]=sum%16;
			sum=sum/16;
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
}
