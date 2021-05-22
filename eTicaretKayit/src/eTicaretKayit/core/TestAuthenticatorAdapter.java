package eTicaretKayit.core;

import eTicaretKayit.entities.concretes.User;

public class TestAuthenticatorAdapter implements AuthenticatorService{

	@Override
	public void register(User user) {
		System.out.println("Test ile kayýt yapýldý : " + user.geteMail());
		
	}

	@Override
	public void login(User user) {
		System.out.println("Test ile giriþ yapýldý : " + user.geteMail());
		
	}

}
