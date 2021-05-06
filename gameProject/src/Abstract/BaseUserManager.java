package Abstract;

import Entities.Gamer;

public abstract class BaseUserManager implements UserService{
	public void login(Gamer gamer) {
		System.out.println("giriþ yapýldý : " +gamer.getFirstName());
	}
	public void logout(Gamer gamer) {
		System.out.println("çýkýþ yapýldý : " +gamer.getFirstName());
	}
	public void delete(Gamer gamer) {
		System.out.println("Kullanýcý silindi : " +gamer.getFirstName());
	}
	public void update(Gamer gamer) {
		System.out.println("Kayýt güncellendi : " +gamer.getFirstName());
	}
}
