package dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAcces.abstracts.UserDao;
import entities.concretes.User;

public class SallamaUserDao implements UserDao {
	ArrayList<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("Sallama ile veri tabanýna eklendi !");
		users.add(user);
		System.out.println("Lütfen e-Postanýzý doðrulayýnýz !");

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User user) {
		this.users.remove(this.users.indexOf(user));
		System.out.println("Kullanýcý baþarýlý bir þekilde kaldýrýldý!");

	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
