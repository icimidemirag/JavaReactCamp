package Concrete;

import Abstract.CheckService;
import Entities.Gamer;

public class GamerCheckManager implements CheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		return true;
	}

}
