package Concrete;

import Abstract.CheckService;
import Abstract.GamerManager;
import Entities.Gamer;

public class BaseGamerManager implements GamerManager{

	private CheckService _checkService;
	
	public BaseGamerManager(CheckService checkService) {
		_checkService = checkService;
	}
	
	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " oyuncusu silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(String.format("%s %s oyuncusu güncellendi.",gamer.getFirstName(),gamer.getLastName()));
		
	}

	@Override
	public void register(Gamer gamer) {
		if (_checkService.CheckIfRealPerson(gamer)) {

			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " oyuncusu kaydedildi.");
		}
		else {
			System.out.println("Not a valid person");
		}
	}
	
}
