package entities;


public class Student extends User {

	private String studentIdentity;
	private double balance;

	public Student(int id, String name, String lastName, String studentIdentity, double balance) {
		super(id, name, lastName);
		this.studentIdentity = studentIdentity;
		this.balance = balance;
		

	}

	public String getStudentIdentity() {
		return studentIdentity;
	}

	public void setStudentIdentity(String studentIdentity) {
		this.studentIdentity = studentIdentity;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance < 0) {
			this.balance = 0;
		} else {
			this.balance = balance;
		}
	}

	
	
}
