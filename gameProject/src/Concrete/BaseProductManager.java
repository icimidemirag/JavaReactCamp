package Concrete;

import Abstract.ProductManager;
import Entities.Gamer;

public class BaseProductManager implements ProductManager{

	@Override
	public void sell(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " oyuncusuna satýþ yapýldý.");
		
	}

}
