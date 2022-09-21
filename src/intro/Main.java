package intro;

public class Main {

	//main java da başlangıç noktasıdır.
	//kontrol space
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		
		//degişken isimlendirmeleri java'da camelCase yazılır.
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		//integer
		int vade = 12;
		
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		
		if (dolarBugun<dolarDun) { //true/false mevzusu
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		} else if (dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);

		}
		
		String[] krediler= {"Hızlı Kredi","Maaşını Halkbanktan alanlar","Mutlu Emekli"};
	
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
		
		
		
		
	}

}
