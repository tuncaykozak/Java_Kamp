package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws  RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(
				Long.parseUnsignedLong("tc numaras�"),
				 "AD (BUYUK)", 
				 "SOYAD (BUYUK)", 
				 1991);
		
		System.out.println("dogrulama : " + (result ? "basarili" : "basarisiz"));
				
		
	}

}
