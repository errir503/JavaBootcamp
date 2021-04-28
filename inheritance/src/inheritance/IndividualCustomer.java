package inheritance;

public class IndividualCustomer extends Customer{
	private String name;
	private String lastName;
	private String nationalIdentitiy;
	public IndividualCustomer(int id, String customerNumber, String name, String lastName, String nationalIdentitiy) {
		super(id, customerNumber);
		this.name = name;
		this.lastName = lastName;
		this.nationalIdentitiy = nationalIdentitiy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalIdentitiy() {
		return nationalIdentitiy;
	}
	public void setNationalIdentitiy(String nationalIdentitiy) {
		this.nationalIdentitiy = nationalIdentitiy;
	}
	
	
}
