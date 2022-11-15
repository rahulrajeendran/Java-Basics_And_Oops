package patternEx;

public class pattern11 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=2*5-2*i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(i+k+" ");
			}
			for(int l=2*(i-1);l>=i;l--) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}

}
