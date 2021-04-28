package inheritance;

public class Main {
	public static void main(String[] args) {

		IndividualCustomer muharrem = new IndividualCustomer(1, "12341234", "Muharrem", "Candan", "1234567890");

		CorporateCustomer hepsiBurada = new CorporateCustomer(2, "123123", "12345678", "546546");

		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(muharrem);
		//customerManager.add(hepsiBurada);
		
		SendikaCustomer sendika = new SendikaCustomer(3,"12312412","ABC");
		//customerManager.add(sendika);
		
		Customer[] customers = {muharrem,hepsiBurada,sendika};
		customerManager.addMultiple(customers);
		//Polirmorphizm (Çok biçimlilik) süper class sub classın referansını tutar bu sayede onu alt sınıfmış gibi gibi kullanma
	}
}
