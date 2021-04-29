package classesWithAttributes;

public class Product {
	
	public Product(int id,String name,String description,double price,int stockAmount,String productColor) {//constructor--yapici
		System.out.println("Yapici blok calisti");
		// new Product denilince calisacak
		
		this.id =id;
		this.productColor =productColor;
		this.name= name;
		this.price=price;
		this.description = description;
		this.stockAmount = stockAmount;
		
	}
	
	
	public Product() {
		
	}
	//Attribute | Field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String productColor;
	private String kod;
	
	/*
	 * public void method() {
	 * 
	 * }
	 */
	
	//getter
	public int getId() {
		return id;
	}
	
	//setter
	public void setId(int id) {
		/* _id=id; */
		this.id =id;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getKod() {
		return this.name.substring(0,1)+id; 
	}

	/*
	 * public void setKod(String kod) { this.kod = kod; }
	 */
}
		
	