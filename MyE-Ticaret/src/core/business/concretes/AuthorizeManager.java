package core.business.concretes;

import core.business.abstracts.AuthorizeService;
import entities.concretes.User;

public class AuthorizeManager implements AuthorizeService {

	@Override
	public void login(User user, String email, String password) {
		if (!user.getEPosta().equals(email) && user.getParola().equals(password)) {
			System.out.println("L�tfen mail adresinizi kontrol ediniz !");
		} else if (user.getEPosta().equals(email) && !user.getParola().equals(password)) {
			System.out.println("L�tfen parolan�z� kontrol ediniz !");
		} else {
			System.out.println("Ba�ar�l� giri� !");
		}

	}

}
