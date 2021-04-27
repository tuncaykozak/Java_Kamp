package homeWork_d2_2;

public class classes {

	public static void main(String[] args) {//is yapan hersey class'tir
		
		//CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager;
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		int sayi1 = 10;
		int sayi2 = 20;
		
		sayi2 = sayi1;
		sayi1 = 30;
		
		System.out.println(sayi2);
		
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		
		sayilar2 =sayilar1;
		sayilar1[0] =15;
		
		System.out.println(sayilar2[0]);
		
		
		
	}

}
//class lar ile gruplama yapilir
//listeleme-guncelleme-silme-kredi karti kullanma

