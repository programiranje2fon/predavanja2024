package dvocas4_ponedeljak.zadatak1;

public class Predmet2 {
	int sifraPredmeta;
	String naziv;
	// deklaracija niza : tip_elemenata_niza[] imeNiza
	int[] ocene;// = new int[100]; 
	// inicijalizacija atributa / kreiranje niza
	// imeNiza = new tipElemenata[brojEelmenata]
	
	int brojUnetihOcena = 0;
	
	Predmet2() {
		// kreiranje niza u konstruktoru
		ocene = new int[100];
	}
	

	Predmet2(String naziv) {
		this.naziv = naziv;
		ocene = new int[100];
	}	
	
	Predmet2(String naziv, int brojStudenata) {
		this.naziv = naziv;
		
		if (brojStudenata > 0) {		
			ocene = new int[brojStudenata];
		} else {
			ocene = new int[100];
			System.out.println("GRESKA!");
		}
	}	
	
	
	void ispisi() {
		System.out.println("Naziv predmeta: "+naziv);
		System.out.println("Ocene:");
		for(int i=0; i < brojUnetihOcena; i++ ) {
			System.out.println(ocene[i]); 
		}
		
	}
	
	void ispisiSaForEach() {
		System.out.println("Naziv predmeta: "+naziv);
		System.out.println("Ocene:");
		// iteracija svih elemenata niza sa foreach naredbom
		for(int ocena : ocene) {
			System.out.println(ocena); 
		}
		
	}	
	
	void unesiOcenu(int ocena) {
		
		if (brojUnetihOcena == ocene.length) {
			System.out.println("Niz je pun!");
			return;
		}
				
		if (ocena < 5 || ocena > 10) {
			System.out.println("Greska! Ocena nije u dozvoljenom rasponu!");
			return;
		}
		
		ocene[brojUnetihOcena] = ocena; // dodela vrednosti i-om elementu niza
		brojUnetihOcena++;
	}
	
	double izracunajProsek() {
		double zbirOcena = 0;
		
		for(int i=0; i<brojUnetihOcena; i++) {
			if (ocene[i] != 0) {
				zbirOcena = zbirOcena + ocene[i];
			}
		}
		
		return zbirOcena / brojUnetihOcena;				
	}
	
	double izracunajProsekForEach() {
		double zbirOcena = 0;
		int brojOcena = 0;
		
		for(int ocena : ocene) {
			if (ocena != 0) {
				zbirOcena = zbirOcena + ocena;
			}
		}
		
		return zbirOcena / brojUnetihOcena;				
	}	

	
	double izracunajProsekSaWhile() {
		double zbirOcena = 0;
		
		int i = 0;
		
		while(ocene[i] != 0) {
			zbirOcena = zbirOcena + ocene[i];
			i++;
		}
		
		return zbirOcena / brojUnetihOcena;				
	}		
	
	void pronadjiNajvisuOcenu() {
		int max = 0;
		
		for(int i=0; i<brojUnetihOcena; i++) {
			if (ocene[i]>max) {
				max = ocene[i];
			}
		}
		
		System.out.println("Najveca ocena je:"+max);
		
	}
	
	
	void izracunajProlaznost() {
		int izaslo = 0;
		int polozilo = 0;
		
		for(int ocena : ocene) {
			if (ocena != 0) {
				izaslo++;
			}
			
			if (ocena > 5) {
				polozilo++;
			}
		}
		
		double prolazanost = polozilo / (double)izaslo;
		
		System.out.println("Prolaznost: "+prolazanost);
	}	
	
	
	
	
	
}
