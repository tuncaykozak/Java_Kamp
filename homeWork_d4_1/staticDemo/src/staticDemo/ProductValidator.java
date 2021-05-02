package staticDemo;

public class ProductValidator {
	
	static {
		
		System.out.println("Statik Yapici Blok calisti");
	}
	
	//Yapici bloklar new yapilinca calisir
	public ProductValidator() {
		System.out.println(" Yapici Blok calisti");
	};
	
	public static boolean isValid(Product product) {
		
		if(product.price>0 && !product.name.isEmpty()) {
			
			return true;			
		}
		else {
			return false;
		}
		
	}
	
	public void bisey() {
		
	}
	
	/*
	 * //inner class
	 *  public static class BaskaBirClass{ 
	 *  public static void Sil() {
	 * 
	 * 	} 
	 * 
	 * }
	 */
}
