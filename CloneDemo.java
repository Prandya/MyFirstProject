package cloning;

public class CloneDemo implements Cloneable{
int rollNo;
String name;

public CloneDemo(int rollNo, String name) {
super();
this.rollNo = rollNo;
this.name = name;
}
	public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	@Override
public String toString() {
	return "CloneDemo [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {

		CloneDemo cd=new CloneDemo(12, "Ram");
		System.out.println(cd);
		CloneDemo cd1 =(CloneDemo) cd.clone();
		System.out.println(cd1);
		System.out.println(cd.hashCode());
		System.out.println(cd1.hashCode());
	}

}
