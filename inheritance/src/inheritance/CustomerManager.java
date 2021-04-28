package inheritance;

public class CustomerManager {
	
	//Polymorphism
	
	public void add (Customer customer) {
		
		System.out.println(customer.customerNumber + " Kaydedildi");
		
	}
	
	
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
	
	/*
	 * public void add(IndividualCustomer customer) {//Birsey dondurmeyecek, yapacak
	 * -void- //Bana Musteri ver
	 * 
	 * System.out.println(customer.customerNumber + " kaydedildi");
	 * 
	 * } public void add(CorporateCustomer customer) {//Birsey dondurmeyecek,
	 * yapacak -void- //Bana Musteri ver
	 * 
	 * System.out.println(customer.customerNumber + " kaydedildi");
	 * 
	 * }
	 */

}
