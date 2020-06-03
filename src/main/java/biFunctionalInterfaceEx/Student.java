package biFunctionalInterfaceEx;

public class Student {

	
	public Student(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
	String name;
	String subject;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + "]";
	}
}
