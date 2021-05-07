package userSim.business.concretes;



import userSim.business.abstracts.ActivationLinkService;
import userSim.business.abstracts.UserService;
import userSim.core.abstracts.MailControllerService;
import userSim.core.abstracts.NameControllerService;
import userSim.core.abstracts.PasswordControllerService;
import userSim.dataAccess.abstracts.UserDao;
/*import userSim.dataAccess.abstracts.UserDao;*/
import userSim.entities.concretes.User;

public class UserManager implements UserService {
	
	boolean checkedName = false;
	boolean checkedMail = false;
	boolean checkedMailIfTaken = false;	
	boolean checkedPassword = false;
	String activationMail;
	
	/* private UserDao userDao; */
	private NameControllerService nameControllerService;
	private MailControllerService mailControllerService;
	private PasswordControllerService passwordControllerService;
	private ActivationLinkService activationMailService = new ActivationLinkManager();
	private UserDao userDao;
	

	
	
	
	
	public UserManager(
		UserDao userDao, NameControllerService nameControllerService , MailControllerService mailControllerService, PasswordControllerService passwordControllerService) {
		
		super();
		this.userDao = userDao;
		this.nameControllerService = nameControllerService;
		this.mailControllerService = mailControllerService;
		this.passwordControllerService = passwordControllerService;
	}
		
	
	
	
	@Override
	public void add(User user) {	
		
		checkedName = nameControllerService.nameControl(user);
		checkedMail = mailControllerService.mailControl(user);
		checkedMailIfTaken = mailControllerService.mailControlIfTaken(user);
		checkedPassword = passwordControllerService.controlPassword(user);
		this.activationMail = this.activationMailService.linkCreate(user);
		
		
		 
		
		if(checkedName && checkedMail && checkedMailIfTaken && checkedPassword) {
		System.out.println("Kayit islemi basarili! Aktivasyon linki gonderildi : " + activationMail);
		userDao.add(user);
		}
		else {
					
		System.out.println("Kayit islemi basarisiz!");
		}
		
	}

	
	

}
	
	


