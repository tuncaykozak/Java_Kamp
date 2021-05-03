package Abstract;

import Entities.Customer;


public interface CustomerCheckService {
	
	public default  boolean CheckIfRealPerson(Customer customer) {
		return false;
		
		
	};

}
