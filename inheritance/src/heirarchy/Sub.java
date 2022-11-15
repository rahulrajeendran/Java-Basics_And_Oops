package heirarchy;

public class Sub extends Operations{
	public static void main(String[] args) {
		Add obj1=new Add();
		Sub obj2=new Sub();
		obj1.opt();
		obj1.adtn();
		obj2.opt();
		obj2.sbt();
	}
	void sbt() {
		int c=super.c-super.d;
		System.out.println(c);
	}
}
