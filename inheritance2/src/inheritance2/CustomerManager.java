package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		System.out.println("Müşteri eklendi");
		logger.log();
	}

	// iş yapan bir sınıf başka bir iş yapan sınıfı kullanıcaksa asla ama asla somut
	// sınıftan gidilmez sub tan değil super den gidilir

}
