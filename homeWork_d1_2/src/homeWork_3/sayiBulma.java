package homeWork_3;

public class sayiBulma {

	public static void main(String[] args) {
		
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
			System.out.println("Sayi Mevcut Degildri");
		}
		
		
		
		
	}
	

}
