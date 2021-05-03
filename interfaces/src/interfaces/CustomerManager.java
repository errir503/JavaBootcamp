package interfaces;

public class CustomerManager {
	/*
	 * 
	 * loosly coupled - gevşek bağlı tightly coupled - katı bağlı Logger _logger;
	 * public CustomerManager(Logger logger) { _logger= logger; }
	 * 
	 * //dependency injection denir buna (bağımlılık çözücü)(tasarım deseni)
	 */

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müsteri eklendi " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName()); // static oldugu icin new'lemeye gerek yok zaten direk
															// oluşuyor
		/*
		 * static ;bir referans oluşuyor ve bundan sonra uygulama durana kadar bellkete
		 * durur
		 */

	}

	public void delete(Customer customer) {
		System.out.println("Müşteri silindi " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
