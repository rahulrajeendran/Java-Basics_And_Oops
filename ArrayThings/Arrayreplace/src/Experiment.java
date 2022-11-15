import java.util.Scanner;

public class Experiment {
	public static void main(String[] args) {
		System.out.println("Enter the limit ");
		Scanner sc=new Scanner(System.in);
		int lim=sc.nextInt();
		System.out.println("Enter the values ");
		int[] array=new int[lim];
		for(int i=0;i<lim;i++) {
			array[i]=sc.nextInt();
		}
		for(int j=0;j<lim;j++) {
			if(array[j]%2==0) {
				array[j]='$';
			}
		}
		for(int i=0;i<lim;i++) {
			if(array[i]=='$') {
				char c=(char)array[i];
				System.out.println(c);
			}
			else {
				System.out.println(array[i]);
			}
		}
	}

}
