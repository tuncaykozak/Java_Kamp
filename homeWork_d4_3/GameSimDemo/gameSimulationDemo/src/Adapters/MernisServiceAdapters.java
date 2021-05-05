package Adapters;
import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			
			result = soapClient.TCKimlikNoDogrula(
					Long.parseLong(user.getNationalityIdentity()),
					user.getFirstName().toUpperCase(),
					user.getLastName().toUpperCase(),
					user.getDateOfBirth().getYear());
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
		
		
	}

}
