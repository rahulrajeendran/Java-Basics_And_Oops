package abstudent;

public abstract class Abstractclass {
	abstract void registration();
	void display(String[] arr,int l) {
		System.out.println("\n");
		for(int i=0;i<l;i++) {
			System.out.println(arr[i]+"\n");
		}
	}
}
