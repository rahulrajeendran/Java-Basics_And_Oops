package telcurbill;

public class Telephonebill {
	double[] arr= {1200.10,2000,3500.40,1500,4500,12000};
	void display(int n){
		System.out.println("Telephone bill amount is : "+arr[n]);
	}
	Telephonebill(){
		Billmain obj3=new Billmain(this);
	}
}
