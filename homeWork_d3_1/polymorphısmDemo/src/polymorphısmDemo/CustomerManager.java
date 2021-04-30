package polymorphýsmDemo;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("Musteri  eklendi");
		
		this.logger.log("Log Mesaji");
		/*
		 * DatabaseLogger logger = new DatabaseLogger(); logger.Log("Log mesaji");
		 */
	}

}
