
public class Student {
	String name, usn;
	int age;
	public Student(String name, String usn, int age){
		this.name=name;
		this.usn=usn;
		this.age=age;
	}
	public String toString(){
		return "Name: "+name+"\nUSN: "+usn+"\nAge:"+age;
	}
}
