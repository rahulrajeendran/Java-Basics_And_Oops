package tftable;

public class ttable {
	public static void main(String[] args) {
		boolean b=true,a=false;
		System.out.print("P\t\t\tQ\t\t\tAND\t\t\tOR\t\t\tXOR\t\t\tNOT\n\n");
		System.out.print(b+"\t\t\t"+b+"\t\t\t"+(b&b)+"\t\t\t"+(b|b)+"\t\t\t"+(b^b)+"\t\t\t"+a+"\n");
		System.out.print(b+"\t\t\t"+a+"\t\t\t"+(b&a)+"\t\t\t"+(b|a)+"\t\t\t"+(b^a)+"\t\t\t"+a+"\n");
		System.out.print(a+"\t\t\t"+b+"\t\t\t"+(a&b)+"\t\t\t"+(a|b)+"\t\t\t"+(a^b)+"\t\t\t"+b+"\n");
		System.out.print(a+"\t\t\t"+a+"\t\t\t"+(a&a)+"\t\t\t"+(a|a)+"\t\t\t"+(a^a)+"\t\t\t"+a+"\n");
	}
}
