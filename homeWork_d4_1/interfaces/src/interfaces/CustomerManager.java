package interfaces;

public class CustomerManager {
	
	private CustomerDal customerDal;
	
	public CustomerManager(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//is kodlari
		
		//OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
		//Bagimli hale geldi
		
		customerDal.add();
	}

}
