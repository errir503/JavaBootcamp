package inheritance2;

public class Main {

	//loglama = kim ne zaman ne yaptı mesela ben ne zxaman instaya girdim ne yaptım gibi gibi 
	// birbirinin alternatifi olan kodlar için if yazılmaz 
	public static void main(String[] args) {
		
	CustomerManager customerManager= new CustomerManager();
	customerManager.add(new EmailLogger ());

	}

}
