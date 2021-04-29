package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"siyah");
		
		/*
		 * Product product = new Product(); product.setId(1); //product.getId();
		 * product.setName("Laptop"); product.setDescription("Asus Laptop");
		 * product.setPrice(5000); product.setStockAmount(3);
		 */
		 
		
		System.out.println(product.getKod());
		
		//ProductManager productManager = new ProductManager();
		//productManager.Add(product);
		
		/*
		 * productManager.Add2(1, "", "", 2, 200); productManager.Add2(1, "", "", 2,
		 * 200); productManager.Add2(1, "", "", 2, 200); productManager.Add2(1, "", "",
		 * 2, 200); productManager.Add2(1, "", "", 2, 200); productManager.Add2(1, "",
		 * "", 2, 200);
		 */
		
		//System.out.println(product.name);

	}

}
