package core.business.concretes;

import core.business.abstracts.AuthorizeService;
import entities.concretes.User;

public class AuthorizeManager implements AuthorizeService {

	@Override
	public void login(User user, String email, String password) {
		if (!user.getEPosta().equals(email) && user.getParola().equals(password)) {
			System.out.println("Lütfen mail adresinizi kontrol ediniz !");
		} else if (user.getEPosta().equals(email) && !user.getParola().equals(password)) {
			System.out.println("Lütfen parolanýzý kontrol ediniz !");
		} else {
			System.out.println("Baþarýlý giriþ !");
		}

	}

}
