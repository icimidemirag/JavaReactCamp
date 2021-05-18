package Concrete;

import Abstract.CampaignManager;

public class BaseCampaignManager implements CampaignManager{

	@Override
	public void enterance() {
		System.out.println("Kampanya eklendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("Kampanya silindi.");
		
	}

	@Override
	public void update() {
		System.out.println("Kampanya güncellendi.");
		
	}

}
