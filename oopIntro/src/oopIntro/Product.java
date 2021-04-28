package oopIntro;

public class Product {
	
	//encapsulation
	private int id; // urun id--ayni isim ve aciklama olursa ayirt edecek
	private String name;// urun ismi
	private double unitPrice;// urun fiyati
	private String detail;// urun detayi
	private double discount;// indirim orani
	
	
	public Product() {
		
	}
	
	public Product(int id, String name, double unitPrice, 
			String detail,double discount/* double unitPriceAfterDiscount*/) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}
	
	
	
	/*
	 * public Product() { // Constructor Block System.out.println("Ben calistim"); }
	 * 
	 * // Signature--ikisi de ayni public Product(int id, String name, double
	 * unitPrice, String detail) { // overloading //this demek bu class demek
	 * this();//Ben calistim yazdiracak this.id = id; this.name = name;
	 * this.unitPrice = unitPrice; this.detail = detail; }
	 */
	
	
}
