package userSim.core.concretes;

import userSim.core.abstracts.LoginControlService;
import userSim.entities.concretes.User;

public class LoginControlManager implements LoginControlService {

	@Override
	public void log(User user, String mail, String password) {
		
		if(user.getEmail() == mail && user.getPassword() == password) {
			System.out.println("Giris Basarili! Hosgeldin " + user.getFirstName());
		}
		else {
			System.out.println("Giris Basarisiz! Bilgilerinizi kontrol ediniz!");
		}
		
	}

}
