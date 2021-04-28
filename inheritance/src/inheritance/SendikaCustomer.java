package inheritance;

public class SendikaCustomer extends Customer {
	private String sendikaName;

	public SendikaCustomer(int id, String customerNumber, String sendikaName) {
		super(id, customerNumber);
		this.sendikaName = sendikaName;
	}

	public String getSendikaName() {
		return sendikaName;
	}

	public void setSendikaName(String sendikaName) {
		this.sendikaName = sendikaName;
	}

}
