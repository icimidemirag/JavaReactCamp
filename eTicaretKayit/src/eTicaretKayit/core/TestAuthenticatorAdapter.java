package eTicaretKayit.core;

import eTicaretKayit.entities.concretes.User;

public class TestAuthenticatorAdapter implements AuthenticatorService{

	@Override
	public void register(User user) {
		System.out.println("Test ile kay�t yap�ld� : " + user.geteMail());
		
	}

	@Override
	public void login(User user) {
		System.out.println("Test ile giri� yap�ld� : " + user.geteMail());
		
	}

}
