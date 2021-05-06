package Concrete;

import Abstract.BaseGameManager;
import Abstract.CampaignService;
import Entities.Game;
import Entities.Gamer;

public class GameManager extends BaseGameManager{
	CampaignService campaignService;
	public GameManager(CampaignService campaignService) {
		this.campaignService=campaignService;
	}
	@Override
	public void sale(Game game,Gamer gamer) {
		
		System.out.println(game.getName() + "satýldý : "+ gamer.getFirstName());
	}
}
