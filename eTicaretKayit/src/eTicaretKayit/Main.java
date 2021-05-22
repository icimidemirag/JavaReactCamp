package eTicaretKayit;

import eTicaretKayit.business.abstracts.UserService;
import eTicaretKayit.business.concretes.UserManager;
import eTicaretKayit.business.concretes.UserValidator;
import eTicaretKayit.core.TestAuthenticatorAdapter;
import eTicaretKayit.core.googleAuthenticatorAdapter;
import eTicaretKayit.dataAccess.concretes.HibernateUserDao;
import eTicaretKayit.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(), new UserValidator(),
				new googleAuthenticatorAdapter());

		User user1 = new User(1, "Ýçimi", "Demirað", "icimidemirag@gmail.com", "111111");

		userService.register(user1);

		userService.login(user1);
		
		//-------------------------------------------------------------------
		
		UserService userServiceTest = new UserManager(new HibernateUserDao(), new UserValidator(),
				new TestAuthenticatorAdapter());

		User user2 = new User(2, "Ýçimi", "Demirað", "icimi@gmail.com", "111111");

		userServiceTest.register(user2);

		userServiceTest.login(user2);

	}

}
