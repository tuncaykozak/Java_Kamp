package oopIntro;

public class Category {
	private int id; // kategori id
	private String name; // kategori adi
	
	public Category() {
		
	}
	
	public Category(int id, String name) {
		//super();// =this(); ile eslenik sayilir
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {//void: birsey dondurmeyecegim, birsey yapacagim
		this.id = id;
	}
	
	public String getName() {
		return this.name +"!";
	}
	
	public void setName(String name) {//parantez icinde verilecek deger aciklaniyor
		this.name =name;
	}

}
