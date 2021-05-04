package Concrete;

import Absract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " has added added !");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " has been removed!");

	}

}
