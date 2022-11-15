package patternEx;

public class Pattern12 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=i;j>=1;j--) {
				if(j%2==0) {
					System.out.print("$");
				}
				else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
