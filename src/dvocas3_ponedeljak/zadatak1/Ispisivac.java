package dvocas3_ponedeljak.zadatak1;

public class Ispisivac {
	 static float prosecnaOcena = 0;
	 final static int MIN_OCENA = 1;
	 final static int MAX_OCENA = 5;

	 // !=
	static void ispisiOcenu(int ocena) {		
		if (ocena < MIN_OCENA || ocena > MAX_OCENA) {
			System.out.println("GRESKA");
			return;
		}
		
		
		if (ocena == 5) {
			System.out.println("Odlican");
		} else if (ocena == 4) {
			System.out.println("Vrlo dobar");
		} else if (ocena == 3) {
			System.out.println("Dobar");
		} else if (ocena == 2) {
			System.out.println("Dovoljan");
		} else {
			System.out.println("Nedovoljan");
		}
	
	}
	
	void ispisiOcenuSaSwitch(int ocena) {
		if (ocena < MIN_OCENA || ocena > MAX_OCENA) {
			System.out.println("GRESKA");
			return;
		}

		switch (ocena) {
			case 5:
				System.out.println("Odlican");
				break;
			case 4:
				System.out.println("Vrlo dobar");
				break;
			case 3:
				System.out.println("Dobar");
				break;
			case 2:
				System.out.println("Dovoljan");
				break;
			default:
				System.out.println("Nedovoljan");
		}
	
	}	
	
	void ispisiZdravo() {
		System.out.println("Zdravo!");
		System.out.println("Zdravo!");
		System.out.println("Zdravo!");
		System.out.println("Zdravo!");
		System.out.println("Zdravo!");
	}

	void ispisiZdravoSaFor() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Zdravo!");
		}
	}	
	
	static void ispisiPoruku(String poruka) {
		for(int i=0; i<10; i++) {
			System.out.println(poruka);
		}
	}
	
	
	static void ispisiPoruku(String poruka, int kolikoPuta) {
		for(int i=0; i<kolikoPuta; i++) {
			System.out.println(poruka);
		}
	}	
	
	static void ispisiBrojeveOd1Do20() {
		System.out.println("Start");
		for(int brojac=1; brojac<=20; brojac++) {
			if (brojac==15) continue; // preskoci tekucu iteraciju petlje i nastavi sledecu
			System.out.println(brojac);
			if (brojac==18) {
				//break; // iskoci iz petlje
				return;
			}
		}
		System.out.println("Stop");
	}
	
	static void vremeDupliranja(double iznos, double kamata) {
		double ukupno = iznos;
		int godina = 0;
		
		while (ukupno / 2 < iznos) {
			godina++;
			ukupno = ukupno + ukupno * kamata;			
		}
		
		System.out.println("Iznos od "+iznos+" rsd sa kamatom od "+kamata+" se duplirao za "+godina+ " godina");
		
	}
	
	static void vremeDupliranja2(double iznos, double kamata) {
		double ukupno = iznos;
		int godina = 0;
		
		do {
			godina++;
			ukupno = ukupno + ukupno * kamata;			
		} while (ukupno / 2 < iznos);
		
		System.out.println("Iznos od "+iznos+" rsd sa kamatom od "+kamata+" se duplirao za "+godina+ " godina");
		
	}
		
	
	

}
