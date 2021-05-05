package Adapters;

import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson (Customer customer) throws RemoteException {
		
		
		
		  KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		  
		  return client.TCKimlikNoDogrula(
		  
				  Long.parseLong(customer.getNationalityId()),
				  customer.getFirstName().toUpperCase(),
				  customer.getLastName().toUpperCase(),
				  customer.getDateOfBirth().getYear() );
		 
		 
		/*
		 * KPSPublicSoapProxy soapClient = new KPSPublicSoapProxy(); boolean result =
		 * false;
		 * 
		 * try { result = soapClient.TCKimlikNoDogrula(
		 * Long.parseLong(customer.getNationalityId()), customer.getFirstName(),
		 * customer.getLastName(), customer.getDateOfBirth().getYear());
		 * 
		 * } catch (NumberFormatException e) { e.printStackTrace(); } catch
		 * (RemoteException e) { e.printStackTrace(); } return result;
		 */
	}

	}
	
	


