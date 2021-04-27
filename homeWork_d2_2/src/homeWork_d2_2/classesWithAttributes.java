package homeWork_d2_2;

public class classesWithAttributes {

	public static void main(String[] args) {
		
		Product product = new Product(1,"Laptop","ASUS Laptop", 3000.00,2);//Constructor Block will work
		/*
		 * Product product = new Product(); product.setName("Laptop"); product.setId(1);
		 * product.setDescription("ASUS Laptop"); product.setPrice(5000.00);
		 * product.setStockAmount(3);
		 */
		
		
	
		
		System.out.println(product.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		productManager.Add2(1, "", "", 2, 200.00);
		
		System.out.println(product.getKod());
		
		
		
		

	}

}
