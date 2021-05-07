package business.abstracts;

import entities.concretes.User;
import java.util.List;

public interface UserService {
	void add(User user);

	void update(User user);

	void delete(User user);

	User get(int id);

	List<User> getAll();

}
