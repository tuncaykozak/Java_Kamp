package homeWork_3;

public class loopDemo {

	public static void main(String[] args) {
		//For
		
		for (int i=1;i<=10;i++) {
			System.out.println(i);
			
		}
		System.out.println("For Dongusu Bitti");
		
		//While
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Dongusu Bitti");
		
		//Do-While
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Dongusu Bitti");
		
		int z=100;
		do {
			System.out.println("Sistem Loglandi");
			System.out.println(z);
			z+=2;
		}while(z<10);
		System.out.println("Do-While Dongusu Bitti");
		
	}
		
}

