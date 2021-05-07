package userSim.core.concretes;

import java.util.regex.Pattern;

import userSim.core.abstracts.MailControllerService;
import userSim.entities.concretes.User;
import userSim.dataAccess.abstracts.UserDao;

public class SystemMailControllerManager implements  MailControllerService {
	
		
	
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	
	
	@Override
	public boolean mailControl(User user) {		
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE); 
		if(pattern.matcher(user.getEmail()).find()) {
			return true;			
		}
		else {
			System.out.println("Mail adresi gecersiz : " + user.getEmail());
			return false;
		}
	}

	@Override
	public boolean mailControlIfTaken(User user) {	
		
		for(User _user :UserDao.users) {
			
			if (user.getEmail() == _user.getEmail()) {
				
				System.out.println("Mail Adresin alinmis : " + user.getEmail());
				return false;
			}
			
			
		}
		return true;
		
	}	
			
		
		
}


