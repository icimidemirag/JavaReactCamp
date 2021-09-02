package gameProject;

import Adapters.MernisServiceAdapter;
import Concrete.BaseCampaignManager;
import Concrete.BaseGamerManager;
import Concrete.BaseProductManager;
import Concrete.GamerCheckManager;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Ýçimi");
		gamer.setLastName("Demirað");
		gamer.setDateYear(2001);
		gamer.setNationalityId("00000000000");
		
		BaseGamerManager baseGamerManager = new BaseGamerManager(new MernisServiceAdapter());
		baseGamerManager.register(gamer);
		
		BaseProductManager baseProductManager = new BaseProductManager();
		baseProductManager.sell(gamer);
		
		BaseCampaignManager baseCampaignManager = new BaseCampaignManager();
		baseCampaignManager.delete();
		
	}

}
