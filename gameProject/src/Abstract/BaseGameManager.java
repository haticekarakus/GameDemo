package Abstract;

import Entities.Game;
import Entities.Gamer;

public abstract class BaseGameManager implements GameService{
	public void sale(Game game,Gamer gamer) {
		System.out.println(game.getName() + "satýldý : "+ gamer.getFirstName());
	}
}
