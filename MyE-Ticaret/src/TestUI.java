import GoogleRegister.GoogleRegisterManager;
import business.abstracts.UserService;
import business.concretes.UserManager;
import core.adapters.abstracts.RegisterService;
import core.adapters.concretes.EmailValidatorManagerAdapter;
import core.adapters.concretes.GoogleRegisterAdapter;
import core.business.abstracts.AuthorizeService;
import core.business.concretes.AuthorizeManager;
import dataAcces.concretes.HibernateUserDao;
import dataAcces.concretes.SallamaUserDao;
import entities.concretes.User;

public class TestUI {
	public static void main(String[] args) {

		User user = new User(1, "Muharrem", "Candan", "1muharremcandan@gmail.com", "123456");

		UserService userService = new UserManager(new HibernateUserDao(), new EmailValidatorManagerAdapter());
		userService.add(user);

		//tekrar giri� 
		AuthorizeService authorizeService = new AuthorizeManager();
		authorizeService.login(user, user.getEPosta(), user.getParola());

		// Kullan�c�lar sisteme Google hesaplar� ile �ye olabilmelidir.
		RegisterService registerService = new GoogleRegisterAdapter();
		registerService.registerToService(user);

		/*
		 * 0 yazd���m�zda listeden elemesi ve 1 yazd���m�zda ismin gelmemsinin nedeni
		 * her eklemede listenin referans�n� kaybetmemizdir
		 */

		// System.out.println(userService.getAll().get(0).getName());

	}

}
