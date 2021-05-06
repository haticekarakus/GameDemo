package Abstract;

import Entities.Gamer;

public abstract class BaseUserManager implements UserService{
	public void login(Gamer gamer) {
		System.out.println("giri� yap�ld� : " +gamer.getFirstName());
	}
	public void logout(Gamer gamer) {
		System.out.println("��k�� yap�ld� : " +gamer.getFirstName());
	}
	public void delete(Gamer gamer) {
		System.out.println("Kullan�c� silindi : " +gamer.getFirstName());
	}
	public void update(Gamer gamer) {
		System.out.println("Kay�t g�ncellendi : " +gamer.getFirstName());
	}
}
