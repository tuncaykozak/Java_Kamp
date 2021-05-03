

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		/* BaseCustomerManager customerManager = new BaseCustomerManager(); */
		
		
		//Abstracts can't new but its done?
		
		/*
		 * BaseCustomerManager manager = new BaseCustomerManager() { };
		 */
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Tuncay");
		customer.setLastName("Kozak");
		customer.setDateOfBirth((1991));
		customer.setNationalityId("1234567890");
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		
		
		customerManager.save(customer);
		
		
		  Customer customer2 = new Customer(); customer2.setId(2);
		  customer2.setFirstName("Oktay"); customer2.setLastName("Kozak");
		  customer2.setDateOfBirth((1987)); customer2.setNationalityId("1234567890");
		  
		  BaseCustomerManager customerManager2 = new StarbucksCustomerManager( new
		  MernisServiceAdapter());
		  
		  
		  customerManager2.save(customer2);
		 

	}

}
