package eTicaretKayit.business.abstracts;

import eTicaretKayit.entities.concretes.User;

public interface UserService {
	void register(User user);

	void login(User user);
}
