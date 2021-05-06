package Abstract;

import Entities.Campaign;

public abstract class BaseCampaignManager implements CampaignService{
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi "+campaign.getCampaignName());
	}
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi "+campaign.getCampaignName());
	}
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi "+campaign.getCampaignName());
	}
}
