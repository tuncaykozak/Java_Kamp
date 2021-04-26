package homeWork_d2_2;

public class methods {

	public static void main(String[] args) {
		
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		
		/*
		 * int [] numbers = new int[] {1,2,5,7,9,0};
		 * 
		 * int numberFor =3; boolean isThere =false;
		 * 
		 * for(int number:numbers) { if(number == numberFor) { isThere = true; break; }
		 * 
		 * }
		 * 
		 * if(isThere) { System.out.println("Sayi Mevcuttur"); } else {
		 * System.out.println("Sayi Mevcut Degildri"); }
		 */
		
	}
	public static void sayiBulmaca() {
		
	int [] numbers = new int[] {1,2,5,7,9,0};
		
		int numberFor =2;
		boolean isThere =false;
		
		for(int number:numbers) {
			if(number == numberFor) {
				isThere = true;
				break;
			}
			
		}
		String mesaj = "";
		if(isThere) {
			mesaj = ("Sayi Mevcuttur : " +numberFor);
			messageSender(mesaj);
		}
		else {
			System.out.println("Sayi Mevcut Degildir : " +numberFor);
		}
		
		
		
	}
	
	public static void messageSender(String mesaj) { //parametreli method
		System.out.println(mesaj);
	}
	
	
	
	
	
	
	
	
	

}
