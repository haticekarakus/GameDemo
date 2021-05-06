import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.UserCheckManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer(1,"Hatice","Karakuþ","11234568732",1999);
		Game game=new Game(3,"Zula");
		GamerManager gamerManager=new GamerManager(new UserCheckManager());
		gamerManager.login(gamer);
		CampaignManager campaignManager=new CampaignManager();
		Campaign campaign=new Campaign(1,"%50 indirim");
		campaignManager.add(campaign);
		GameManager gameManager=new GameManager(campaignManager);
		gameManager.sale(game, gamer);
	}

}
