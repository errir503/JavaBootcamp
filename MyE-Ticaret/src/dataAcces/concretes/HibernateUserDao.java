package dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAcces.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	// Bu liste tamamen simülasyon normalde database ye gidecek ama simüle amaçlý buraya kaydediyormuþ gibi 
	ArrayList<User> users = new ArrayList<User>();
	

	@Override
	public void add(User user) {

		System.out.println("Hibernate ile eklendi " + user.getName());
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
		System.out.println("Kullanýcý Hibernate ile kaldýrýldý !");

	}

	@Override
	public User get(int id) {

		return users.get(id);
	}

	@Override
	public List<User> getAll() {
	

		return users;
		
	}

}
