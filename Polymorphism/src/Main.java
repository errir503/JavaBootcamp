import java.util.Date;

public class Main {
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.Add();
		Date date = new Date();
		System.out.println(date);

	}

}
 