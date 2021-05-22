package eTicaretKayit.dataAccess.abstracts;

import java.util.List;

import eTicaretKayit.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
	User get(int id);
	List<User> getAll();
}
