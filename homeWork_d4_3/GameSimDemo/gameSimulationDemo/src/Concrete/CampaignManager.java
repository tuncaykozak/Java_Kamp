package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName()+" kampanyasi eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName()+" kampanyasi silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName()+" kampanyasi guncellendi");
		
	}

}
