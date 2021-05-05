package Concrete;

import java.text.DecimalFormat;

import Abstract.SellingService;
import Entities.Campaign;
import Entities.Game;

public class SellingManager implements SellingService {

	@Override
	public void sale(Game game) {
		
		System.out.println(game.getGameName()+" oyunu " +
							game.getPrice() + " TL'ye satin alinmistir");
		
	}

	@Override
	public void saleWithCampaign(Game game, Campaign campaign) {
		
		System.out.println(game.getGameName()+ " oyunu " +		
							new DecimalFormat("##.##").format(
							game.getPrice()*((100-campaign.getDiscountRate())/100))+
							"(%"+ new DecimalFormat("##").format(
									campaign.getDiscountRate())+ " indirimle)"+
							" TL'ye satin alinmistir");
		
	}

	
		
	}


