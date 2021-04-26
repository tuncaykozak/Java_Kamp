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
		
		int numberFor =3;
		boolean isThere =false;
		
		for(int number:numbers) {
			if(number == numberFor) {
				isThere = true;
				break;
			}
			
		}
		
		if(isThere) {
			System.out.println("Sayi Mevcuttur");
		}
		else {
			System.out.println("Sayi Mevcut Degildir");
		}
		
		
		
	}

}
