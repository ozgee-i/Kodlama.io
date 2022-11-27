package intro;

public class Main {
        //main javada başlangıç noktasıdır
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		String ortaMetin="İlgili ";
		String altMetin="Vade süresi";		
		System.out.println(ortaMetin +altMetin);
		
		//integer
		int vade = 12;
		double dolarDun=18.20;
		double dolarBugun=18.20;
		
		boolean dolarDurumu=false;
		
		String okYonu= "";
		
		if (dolarBugun<dolarDun) { 
			okYonu="down.svg";
			System.out.println(okYonu);
		} 
		else if(dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		String[] krediler= {"hızlı kredi","maaş","emekli"};
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);			
		}

	}

}
