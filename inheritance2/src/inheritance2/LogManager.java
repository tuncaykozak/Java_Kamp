package inheritance2;

public class LogManager {
	
	public void log(int logType ) {
		if (logType ==1) {
			System.out.println("Veritabanina loglandi");
		}
		else if(logType ==2) {
			System.out.println("Dosyaya loglandi");
		}
		else {
			System.out.println("Email gonderildi");
		}
		
		
	}

}


//1 - Database
//2 -File
//3 - Email