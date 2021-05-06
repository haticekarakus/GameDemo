package Concrete;

import Abstract.BaseUserManager;
import Abstract.UserCheckService;
import Entities.Gamer;

public class GamerManager extends BaseUserManager{
	private UserCheckService userCheckService;
	public GamerManager(UserCheckService userCheckService) {
		this.userCheckService=userCheckService;
	}
	@Override
	public void login(Gamer gamer) {
		if(userCheckService.checkIfRealPerson(gamer)) {
			super.login(gamer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}
	
}
