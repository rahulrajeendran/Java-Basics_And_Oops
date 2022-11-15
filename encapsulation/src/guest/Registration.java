package guest;

import java.util.regex.Pattern;

public class Registration {
	private int num;
	private String name,add,email,ptype;
	private long phno,pid;
	int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0;
	public int getNum() {
		return num;
	}
	protected void setNum(int num) {
		String str1=String.valueOf(num);
		if(str1.matches("^[0-9]*$")){
			this.num=num;
		}
		else {
			n1++;
			
		}	
	}
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		if(name.matches("^[A-Z,a-z]*$")) {
			this.name=name;
		}
		else {
			n2++;
		}
	}
	public String getAdd() {
		return add;
	}
	protected void setAdd(String add) {
		if(add.matches("^[A-Z,a-z,0-9]*$")) {
			this.add=add;
		}
		else {
			n3++;
		}
		
	}
	public long getPno() {
		return phno;
	}
	protected void setPno(long num) {
		String str2=String.valueOf(num);
		if(str2.matches("^[0-9]*$")) {
			phno=num;
		}
		else {
			n4++;
		}
	}
	public String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		if(email.matches("^[A-Z,a-z,0-9]*[@]*$")) {
			this.email=email;
		}
		else {
			n5++;
		}		
	}
	public String getPtype() {
		return ptype;
	}
	protected void setPtype(String type) {
		if(type.matches("^[A-Z,a-z]*$")) {
			ptype=type;
		}
		else {
			n6++;
		}	
	}
	public long getPid() {
		return pid;
	}
	protected void setPid(long pid) {
		String str3=String.valueOf(pid);
		if(str3.matches("^[0-9]*$")) {
			this.pid=pid;
		}
		else {
			n7++;
		}
	}
	boolean check(){
		if(n1==0&&n2==0&&n3==0&&n4==0&&n5==0&&n6==0&&n7==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
