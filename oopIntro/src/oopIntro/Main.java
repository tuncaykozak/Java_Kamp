package oopIntro;

public class Main {

	public static void main(String[] args) {

		/*
		 * String [] products = { "Lenovo V14", "Lenovo V15", "Hp 5" };
		 */

		/*
		 * int[] unitsInstock = { 3, 4, 5 };
		 */

		//Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram", 10/*, 13500*/);
		
		
		/*
		 * Product product1 = new Product();//Ornek,referans olusturma instance creation
		 * product1.id =1; product1.name ="Lenovo V14"; product1.unitPrice =15000;
		 * product1.detail = "16 GB Ram";
		 */

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		// product2.setUnitPriceAfterDiscount set edilemiyor.

		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 =new Category();
		category1.setId(1);
		category1.setName("Icecek");
		

		Category category2 =new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		
		
		
		
		

		/* Product product3 = new Product(); */

		/*
		 * Product[] products = { product1, product2, product3 }; // getProducts();
		 * 
		 * for (Product product : products) {// Product veri turu
		 * 
		 * System.out.println(product.getName()); }
		 * 
		 * 
		 * System.out.println(); //sysout snippet--sysout sonra ctrl+space
		 * 
		 * 
		 * System.out.println(products.length);
		 * 
		 * Category category1 = new Category(); category1.id = 1; category1.name =
		 * "Bilgisayar";
		 * 
		 * Category category2 = new Category(); category2.id = 2; category2.name =
		 * "Ev/Bahce";
		 * 
		 * ProductManager productManager = new ProductManager();
		 * productManager.addToCart(product1);
		 * 
		 * productManager.addToCart(product2);
		 * 
		 * productManager.addToCart(product3);
		 */

	}

}
