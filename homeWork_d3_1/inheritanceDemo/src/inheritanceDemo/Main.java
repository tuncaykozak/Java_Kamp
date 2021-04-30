package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		/* OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager(); */
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
		
		//BaseKrediManager digerlerine miras verdigi icin
		
		
		
	}

}
