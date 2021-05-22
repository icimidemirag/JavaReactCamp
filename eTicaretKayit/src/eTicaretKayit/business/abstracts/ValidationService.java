package eTicaretKayit.business.abstracts;

import java.util.List;

import eTicaretKayit.entities.concretes.User;

public interface ValidationService {
	String checkUser(User user);

	boolean isThere(User user, List<User> users);
}
