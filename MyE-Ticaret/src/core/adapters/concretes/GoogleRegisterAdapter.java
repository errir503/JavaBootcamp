package core.adapters.concretes;

import GoogleRegister.GoogleRegisterManager;
import core.adapters.abstracts.RegisterService;
import entities.concretes.User;

public class GoogleRegisterAdapter implements RegisterService{

	@Override
	public void registerToService(User user) {
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.register();
	}

	
}
