package javainterface;

public class Student implements Stddetails,Mark{
	public static void main(String[] args) {
		Student obj=new Student();
		obj.mark();
		obj.clg();
		obj.home();
	}
	public void mark(){
		System.out.println("76");
	}
	public void clg() {
		System.out.println("wefohwrife");
	}
	public void home() {
		System.out.println("calicut");
	}
}
