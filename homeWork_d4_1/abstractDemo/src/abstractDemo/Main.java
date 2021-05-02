package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.basedatabasemanager = new OracleDatabaseManager();
		
		customerManager.getCustomers();
		
		
		CustomerManager customerManager2 = new CustomerManager();
		customerManager2.basedatabasemanager = new SqlServerDataBaseManager();
		
		customerManager2.getCustomers();
		
		
		CustomerManager customerManager3 = new CustomerManager();
		customerManager3.basedatabasemanager = new MySqlDatabaseManager();
		
		customerManager3.getCustomers();
	}

}
