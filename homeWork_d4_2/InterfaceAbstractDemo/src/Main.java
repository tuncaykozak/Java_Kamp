import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		
		  BaseCustomerManager customerManager = new NeroCustomerManager();
		  customerManager.save(new Customer( 1, "TUNCAY", "KOZAK", LocalDate.of(1991,
		  9, 12), "123456789" ));
		 
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(new Customer(
				1,
				"TUNCAY",
				"KOZAK",
				LocalDate.of(1991, 9, 12),
				"123456789"
				));
	}
	
	/*
	 * public static void main(String[] args) throws RemoteException {
	 * 
	 * 
	 * KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
	 * 
	 * boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(
	 * Long.parseLong("123456789"), "TUNCAY", "KOZAK", 1991 // Doðum Yýlý );
	 * System.out.println("Doðrulama durumu : gerçek kiþi " + (result ? "" :
	 * "deðil"));
	 * 
	 * }
	 * 
	 */
		
}
	


