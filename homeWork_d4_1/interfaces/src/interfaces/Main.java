package interfaces;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * CustomerDal customerDal = new CustomerDal() {
		 * 
		 * @Override public void add() {
		 * 
		 * 
		 * } };
		 */
		
		//CustomerDal customerDal = new OracleCustomerDal();
		
		CustomerManager customerManager = new CustomerManager(new 												OracleCustomerDal());
		//customerManager.customerDal = new MySqlCustomerDal();
		customerManager.add();
		
		/*
		 * CustomerManager customerManager2 = new CustomerManager();
		 * customerManager2.customerDal = new OracleCustomerDal();
		 * customerManager2.add();
		 */
	}

}
