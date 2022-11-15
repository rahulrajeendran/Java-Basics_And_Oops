package booking;

public class Trainticket {
	private int nop;
	private int[] age;
	private String[] name;
	private char[] gender;
	private long price;
	public long getPrie() {
		return price;
	}
	protected void setPrice(long num) {
		price=num;
	}
	public int getNop() {
		return nop;
	}
	protected void setNop(int nop) {
		this.nop=nop;
	}
	public String[] getName() {
		return name;
	}
	protected void setName(String[] name) {
		this.name=name;
	}
	public char[] getGender() {
		return gender;
	}
	protected void setGender(char[] gender) {
		this.gender=gender;
	}
	public int[] getAge() {
		return age;
	}
	protected void setAge(int[] age) {
		this.age=age;
	}
}
