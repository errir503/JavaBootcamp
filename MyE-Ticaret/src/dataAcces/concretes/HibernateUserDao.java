package dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAcces.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	// Bu liste tamamen sim�lasyon normalde database ye gidecek ama sim�le ama�l� buraya kaydediyormu� gibi 
	ArrayList<User> users = new ArrayList<User>();
	

	@Override
	public void add(User user) {

		System.out.println("Hibernate ile eklendi " + user.getName());
		users.add(user);
		System.out.println("L�tfen e-Postan�z� do�rulay�n�z !");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User user) {
		this.users.remove(this.users.indexOf(user));
		System.out.println("Kullan�c� Hibernate ile kald�r�ld� !");

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
