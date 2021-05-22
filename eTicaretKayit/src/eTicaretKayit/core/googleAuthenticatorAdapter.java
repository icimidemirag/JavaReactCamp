package eTicaretKayit.core;

import eTicaretKayit.entities.concretes.User;
import eTicaretKayit.googleAuthenticator.GoogleAuthenticatorManager;

public class googleAuthenticatorAdapter implements AuthenticatorService {

	@Override
	public void register(User user) {
		GoogleAuthenticatorManager auth = new GoogleAuthenticatorManager();
		auth.register(user.geteMail());
	}

	@Override
	public void login(User user) {
		GoogleAuthenticatorManager auth = new GoogleAuthenticatorManager();
		auth.login(user.geteMail());
	}

}
