package eTicaretKayit.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretKayit.dataAccess.abstracts.UserDao;
import eTicaretKayit.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	public List<User> users = new ArrayList<>();

	@Override
	public void register(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kaydedildi.");

	}

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " giriþ yaptý.");

	}

	@Override
	public User get(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
