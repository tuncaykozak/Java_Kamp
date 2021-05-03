package Adapters;

import Entities.Customer;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub;
import Abstract.CustomerCheckService;


public class MernisServiceAdapter implements CustomerCheckService {
	
	public boolean CheckIfRealPerson(Customer customer) {
		
		  boolean result=false;
			
			
			
			KPSPublicSoap client = new KPSPublicSoapProxy();
			
					try {
						result =client.TCKimlikNoDogrula(
								Long.parseLong(customer.getNationalityId()),
								customer.getFirstName().toUpperCase(),
								customer.getLastName().toUpperCase(),
								customer.getDateOfBirth());
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
					if(result) {
						System.out.println("Kimlik dogrulama basarili");
					}else {
						System.out.println("Kimlik doðrulama basarisiz.");
					}
					return result;

}
}
