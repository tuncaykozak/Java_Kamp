package userSim;

import userSim.business.abstracts.ActivationControllerService;
import userSim.business.abstracts.UserService;
import userSim.business.concretes.ActivationControllerManager;
import userSim.business.concretes.UserManager;
import userSim.core.abstracts.LoginControlService;
import userSim.core.adapters.GMailValidaterManagerAdapter;
import userSim.core.concretes.LoginControlManager;
import userSim.core.concretes.NameControllerManager;
import userSim.core.concretes.PasswordControllerManager;
import userSim.core.concretes.SystemMailControllerManager;
import userSim.dataAccess.concretes.AbcUserDao;
import userSim.dataAccess.concretes.HibernateUserDao;
/*import userSim.dataAccess.concretes.HibernateUserDao;*/
import userSim.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Tuncay");
		user1.setLastName("Kozak");
		user1.setEmail("tuncaykozak@gmail.com");
		user1.setPassword("12345678");
		
		User user2 = new User(2,"Oktay","Kozak","oktaykozak@gmail.com","123456789");
		
		User user3 = new User();
		user3.setId(3);
		user3.setFirstName("Hamid");
		user3.setLastName("Atintop");
		user3.setEmail("hamid@gmail.xx");
		user3.setPassword("12345678");
		
		User user4 = new User(4,"U","Ulasilmaz","ulasilmazadam@yahoo.com","12345678");
		User user5 = new User(5,"Usameddin","Ulasilmaz","ulasilmazadam@yahoo.com","1234");
		
		User user11 = new User();
		user11.setId(11);
		user11.setFirstName("Sen");
		user11.setLastName("Kimsin");
		user11.setEmail("tuncaykozak@gmail.com");
		user11.setPassword("87654321");
		
		
		
		
		UserService service = new UserManager(
			new HibernateUserDao(),new NameControllerManager(), new SystemMailControllerManager(), new PasswordControllerManager());
		
		UserService service2 = new UserManager(
				new AbcUserDao(),new NameControllerManager(), new SystemMailControllerManager(), new PasswordControllerManager());
		
		
		
		
		
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("*****EKLEME ISLEMLERI:");
		System.out.println();
		
		service.add(user1);
		System.out.println("");
		service2.add(user2);
		System.out.println();
		service.add(user3);
		System.out.println("");
		service2.add(user4);
		System.out.println("");
		service.add(user5);
		System.out.println("");
		service2.add(user11);
		System.out.println("");
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("*****AKTIVASYON KONTROLU:");
		System.out.println();	
		
		user1.setActivated(true);
		
		ActivationControllerService service3 = new ActivationControllerManager();
		System.out.println(service3.isActive(user1));
		System.out.println();	
		System.out.println(service3.isActive(user2));
		System.out.println();	
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("*****GIRIS KONTROLU:");
		System.out.println();		
		
		String deneme1Mail = "tuncaykozak@gmail.com";
		String deneme1Password ="12345678";
		
		String deneme2Mail = "oktaykozak@gmail.com";
		String deneme2Password ="12345678";
		
		LoginControlService service4 = new LoginControlManager();
		service4.log(user1,deneme1Mail,deneme1Password);
		System.out.println("");
		service4.log(user2, deneme2Mail, deneme2Password);
		System.out.println();	
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("***** GMAIL GIRIS KONTROLU:");
		System.out.println();		
		
		User user6 = new User();
		user6.setEmail("bilmemkim@gmail.com");
		
		User user7 = new User();
		user7.setEmail("bilmemkim@hotmail.com");
		
		GMailValidaterManagerAdapter adapter = new GMailValidaterManagerAdapter();
		System.out.println(adapter.isGmail(user6));
		System.out.println();
		System.out.println(adapter.isGmail(user7));
		
		
	

	}

}
