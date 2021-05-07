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

		// e�er ayn� e-eposta adresi mevcutsa uyar� gelecek (E-Posta daha �nce
		// kullan�lmam�� olmal�d�r.)
		if (userDao.getAll().contains(user)) {
			System.out.println("Bu e-posta adresi sistemde mevcut !");
			return;
		}

		// Ad ve soyad en az iki karakterden olu�mal�d�r.
		if (user.getName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("�sim ve Soyisim en az iki karakterden olu�mak zorunda !");
			return;
		}

		// E-posta alan� e-posta format�nda olmal�d�r
		if (!emailValidatorManagerAdapter.isEmailValid(user.getEPosta())) {
			System.out.println("Kullan�c� eEposta adresi hatal�!");
			return;
		}
		
		
		// Parola en az 6 karakterden olu�mal�d�r.
		if (user.getParola().length() < 6) {
			System.out.println("Kullan�c� parolas� minumum 6 karakterden olu�mal�d�r ! ");
			return;
		}

		// �stteki kurallar� ge�erse eklem i�lemi yap�lacak
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
