package eTicaretKayit.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretKayit.business.abstracts.ValidationService;
import eTicaretKayit.entities.concretes.User;

public class UserValidator implements ValidationService {

	@Override
	public String checkUser(User user) {
		if (user.getPassword().length() < 6) {
			return "Parola en az 6 karakterden oluþmalýdýr.";
		}
		String emailPattern = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern p = Pattern.compile(emailPattern);
		Matcher m = p.matcher(user.geteMail());
		if (!m.matches()) {
			return "E-posta alaný e-posta formatýnda olmalýdýr.";
		}
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			return "Ad ve soyad en az iki karakterden oluþmalýdýr.";
		}

		return null;
	}

	@Override
	public boolean isThere(User user, List<User> users) {
		for (User user2 : users) {
			if (user2.geteMail() == user.geteMail()) {
				return true;
			}
		}
		return false;
	}

}
