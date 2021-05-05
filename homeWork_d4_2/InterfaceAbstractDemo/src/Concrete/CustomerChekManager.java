package Concrete;
import Abstract.CustomerCheckService;
import Entities.Customer;


public class CustomerChekManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
		
	}

	

}
