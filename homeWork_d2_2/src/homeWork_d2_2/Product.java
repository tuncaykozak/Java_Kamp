package homeWork_d2_2;

public class Product {
	
	/*
	 * public Product() { System.out.println("Yapici Block Calisti"); }
	 */
	
	//Overloading
	
	public Product(int id, String name, String description, double price, int stockAmount) {
		System.out.println("Yapici Block Calisti");
		this.id =id;
		this.name =name;
		this.description =description;
		this.price = price;
		this.stockAmount =stockAmount;
		
	}
	public Product(){
		
	}
	
	// attribute | field
	int id;
	private String name;
	private String description;
	private Double price;
	private int stockAmount;
	
	private String kod;
	
	
	//getter
	public int getId() {
		return id;
	}
	
	//setter
	public void setId(int id) {
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getKod() {
		
		this.kod = this.name.substring(0,1)+this.id;
		return this.kod;
	}


}

	