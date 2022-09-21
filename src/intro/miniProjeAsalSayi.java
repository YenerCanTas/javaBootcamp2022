package intro;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 25;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
			
		if(number == 1) {
			System.out.println("Asal sayı değildir");
			return;
		}
		
		
		
		for(int i=2; i<24; i++) {
			if(number % i ==0) {
				isPrime = false;
			}
		}
			
		if(isPrime) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}
			

	}

}
