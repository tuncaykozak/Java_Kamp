import java.time.LocalDate;

import Adapters.MernisServiceAdapters;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SellingManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		
		user1.setId(1);
		user1.setFirstName("Tuncay");
		user1.setLastName("Kozak");
		user1.setDateOfBirth(LocalDate.of(1991, 2, 12));
		user1.setNationalityIdentity("1234567890");
		
		UserManager userManager = new UserManager(new MernisServiceAdapters());		
		userManager.add(user1);
		userManager.delete(user1);
		System.out.println();
		
		
		User user2 = new User(2,"Engin","Demiroð",LocalDate.of(1985, 1, 6),"28861499108");
		/* UserManager userManager2 = new UserManager(new MernisServiceAdapters()); */		
		userManager.add(user2);
		userManager.update(user2);
		System.out.println();
		
		
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Battlefield");
		game1.setPrice(199.99);

		Game game2 = new Game(2,"Fifa21",299.99);
		/*
		 * game2.setId(2); game2.setGameName("Fifa21"); game2.setPrice(299.99);
		 */

		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.delete(game1);
		gameManager.update(game2);
		System.out.println();
		
		
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignName("FPS Kampanyasý");
		campaign1.setDiscountRate(20);

		Campaign campaign2 = new Campaign(2, "Spor Oyunlari Kampanyasi",15);
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.update(campaign1);
		campaignManager.delete(campaign2);
		System.out.println();
		
		
		
		SellingManager sellingManager = new SellingManager();		
		
		sellingManager.sale(game1);
		sellingManager.saleWithCampaign(game2, campaign2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
