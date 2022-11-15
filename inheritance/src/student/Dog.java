package student;

public class Dog extends Animal{
	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.sound();
		obj.color();
//		super.sound();
	}
	void sound() {
		System.out.println("bark");
	}
	void color() {
		System.out.println("Black");
	}
}
