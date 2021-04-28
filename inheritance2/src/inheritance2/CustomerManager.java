package inheritance2;

public class CustomerManager {
	
	public void add(Logger logger) {
		//Muster Ekleme Kodlari
		
		System.out.println("Musteri eklendi");
		//DatabaseLogger logger = new DatabaseLogger();//new lenmemeli-surdurulebilir olmaz-
		logger.log();
	}

}
