package numberpattern;

public class Pyramid {
	void numpyramid(int n) {
		int k=1,l=1,m=0,p=1;
		for(int i=-(n-3);i<n-2;i++) {
			for(int j=0;j<n-k;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+(n+i);j++) {
				if(j==0 || j==(i+(n+i))-1) {
					System.out.print("1");
					p=1;
				}
				else if(j%2!=0) {
					System.out.print(" ");
				}
				else {
					m=p+l;
					System.out.print(m);
					
				}
			}
			System.out.println("");
			k++;
			if(i>-1) {
				l=m;
				p=m;
			}
		}
	}
}
