
import Adapters.MernisServiceAdapters;
import Concrete.CustomerManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class UI {
	public static void main(String[] args) {

		Campaign summerCampaign = new Campaign(1, "Summer Campaign", 25);
		
		Game theLastDayInWorld = new Game(1, "The Last Day In The World", 100, 20, summerCampaign);
		//System.out.println(theLastDayInWorld.getPrice());
		
		Customer customer = new Customer(1,"Muharrem","Candan","12056735560",2001,200,null);
		
		Absract.BaseCustomerManager customerManager = new CustomerManager(new MernisServiceAdapters());
		customerManager.add(customer);
		
		
         
		
		  System.out.println("Dear "+customer.getCustomerName()+" , you got  "+summerCampaign.getCampaignName() +", you have %" +summerCampaign.getCampaignPrice()+
				  " discount at this game "+theLastDayInWorld.getName()+".The old price is "+theLastDayInWorld.getPrice()+" After the price  "+theLastDayInWorld.getAfterCampaignPrice()   );
		
		

	}

}
