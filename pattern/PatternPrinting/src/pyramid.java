import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int l=sc.nextInt();
		System.out.println("Enter the symbol");
		String str=sc.next();
		for(int i=1;i<l+1;i++) {
			for(int j=l;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print(str);
			}
			System.out.println("");
		}
	}

}
