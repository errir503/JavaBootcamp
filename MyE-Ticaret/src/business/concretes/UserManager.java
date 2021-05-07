package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import core.adapters.concretes.EmailValidatorManagerAdapter;
import dataAcces.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private EmailValidatorManagerAdapter emailValidatorManagerAdapter;

	public UserManager(UserDao userDao, EmailValidatorManagerAdapter emailValidatorManagerAdapter) {
		this.userDao = userDao;
		this.emailValidatorManagerAdapter = emailValidatorManagerAdapter;
	}

	@Override
	public void add(User user) {

		// eðer ayný e-eposta adresi mevcutsa uyarý gelecek (E-Posta daha önce
		// kullanýlmamýþ olmalýdýr.)
		if (userDao.getAll().contains(user)) {
			System.out.println("Bu e-posta adresi sistemde mevcut !");
			return;
		}

		// Ad ve soyad en az iki karakterden oluþmalýdýr.
		if (user.getName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ýsim ve Soyisim en az iki karakterden oluþmak zorunda !");
			return;
		}

		// E-posta alaný e-posta formatýnda olmalýdýr
		if (!emailValidatorManagerAdapter.isEmailValid(user.getEPosta())) {
			System.out.println("Kullanýcý eEposta adresi hatalý!");
			return;
		}
		
		
		// Parola en az 6 karakterden oluþmalýdýr.
		if (user.getParola().length() < 6) {
			System.out.println("Kullanýcý parolasý minumum 6 karakterden oluþmalýdýr ! ");
			return;
		}

		// üstteki kurallarý geçerse eklem iþlemi yapýlacak
		userDao.add(user);

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User get(int id) {

		return userDao.get(id);
	}

	@Override
	public List<User> getAll() {

		return userDao.getAll();
	}

}
