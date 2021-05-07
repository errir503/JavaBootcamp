package core.adapters.concretes;

import EmailValidator.EmailValidator;
import core.adapters.abstracts.EmailValidatorService;

public class EmailValidatorManagerAdapter implements EmailValidatorService {

	@Override
	public boolean isEmailValid(String emailInput) {
		EmailValidator emailValidator = new EmailValidator();
		return emailValidator.isEmailValid(emailInput);

	}

}
