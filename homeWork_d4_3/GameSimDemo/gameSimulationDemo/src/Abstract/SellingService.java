package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface SellingService {
	
	void sale(Game game);
	
	void saleWithCampaign(Game game,Campaign campaign);

}
