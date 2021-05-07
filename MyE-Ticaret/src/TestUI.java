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

		//tekrar giriþ 
		AuthorizeService authorizeService = new AuthorizeManager();
		authorizeService.login(user, user.getEPosta(), user.getParola());

		// Kullanýcýlar sisteme Google hesaplarý ile üye olabilmelidir.
		RegisterService registerService = new GoogleRegisterAdapter();
		registerService.registerToService(user);

		/*
		 * 0 yazdýðýmýzda listeden elemesi ve 1 yazdýðýmýzda ismin gelmemsinin nedeni
		 * her eklemede listenin referansýný kaybetmemizdir
		 */

		// System.out.println(userService.getAll().get(0).getName());

	}

}
