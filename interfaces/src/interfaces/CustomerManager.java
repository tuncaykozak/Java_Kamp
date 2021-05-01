package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	
	public CustomerManager(Logger[] loggers) {
		//super();
		this.loggers = loggers;
	}

	//lousy - tightly coupled
	public void add(Customer customer) {	
		
		System.out.println("Musteri eklendi : " + customer.getFirstName());
		
		//Utils utils = new Utils();
		Utils.runLOggers(loggers, customer.getFirstName());
		
	
	}
	
	public void delete(Customer customer) {
		

		System.out.println("Musteri silindi : " + customer.getFirstName());
		Utils.runLOggers(loggers, customer.getLastName());
		
		
		
	}

}
