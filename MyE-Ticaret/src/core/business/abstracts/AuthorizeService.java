package core.business.abstracts;

import entities.concretes.User;

public interface AuthorizeService {
	
		void login(User user,String email,String password);
		

	}

