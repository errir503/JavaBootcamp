package entities;

public class Instrocter extends User {

	public Instrocter(int id, String name, String lastName, String department) {
		super(id, name, lastName);
		this.department = department;
	}

	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
