package eTicaretKayit.core;

import eTicaretKayit.entities.concretes.User;

public interface AuthenticatorService {
	void register(User user);
	void login(User user);
}
