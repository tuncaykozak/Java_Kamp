import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(
				1,
				"TUNCAY",
				"KOZAK",
				LocalDate.of(1991, 9, 12),
				"35107426200"
				));
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(
				new MernisServiceAdapter());
		customerManager2.save(new Customer(
				1,
				"TUNCAY",
				"KOZAK",
				LocalDate.of(1991, 9, 12),
				"35107426200"
				));
		
		
		

	}

}
