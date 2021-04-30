package polymorphýsmDemo;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EmailLogger logger = new EmailLogger(); logger.Log("Log Mesaji");
		 */
		
		/*
		 * BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new
		 * DatabaseLogger(), new EmailLogger(), new ConsoleLogger()};
		 * 
		 * for(BaseLogger logger : loggers ) {
		 * 
		 * logger.Log("Log mesaji");
		 * 
		 * }
		 */
		
		CustomerManager customerManager1 = new CustomerManager(new DatabaseLogger());
		
	    customerManager1.add();
	    
	    CustomerManager customerManager2 = new CustomerManager(new FileLogger());
		
	    customerManager2.add();
	}

}
