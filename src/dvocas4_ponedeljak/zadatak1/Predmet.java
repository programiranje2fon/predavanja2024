package dvocas4_ponedeljak.zadatak1;

public class Predmet {
	int sifraPredmeta;
	String naziv;
	// deklaracija niza : tip_elemenata_niza[] imeNiza
	int[] ocene;// = new int[100]; 
	// inicijalizacija atributa / kreiranje niza
	// imeNiza = new tipElemenata[brojEelmenata]
	
	/*
	Predmet() {
		// kreiranje niza u konstruktoru
		ocene = new int[100];
	}
	*/

	Predmet(String naziv) {
		this.naziv = naziv;
		ocene = new int[100];
	}	

	
	Predmet(String naziv, int brojStudenata) {
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
		for(int i=0; i<ocene.length; i++ ) {
			// pristupamo i-om elementu niza: niz[i]
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
		
		if (ocena < 5 || ocena > 10) {
			System.out.println("Greska! Ocena nije u dozvoljenom rasponu!");
			return;
		}
		
		boolean unetaOcena = false; // pomocna semafor promenljiva
		
		for(int i=0; i<ocene.length; i++) {
			if (ocene[i] == 0) { // provera uslova za tekuci i-ti element niza  
				ocene[i] = ocena; // dodela vrednosti i-om elementu niza
				unetaOcena = true;
				break; // prekidanje petlje
			}
		}
		
		if (unetaOcena == false) {
			System.out.println("GRESKA: nema mesta u nizu!");
		}		
	}
	
	double izracunajProsek() {
		double zbirOcena = 0;
		int brojOcena = 0;
		
		for(int i=0; i<ocene.length; i++) {
			if (ocene[i] != 0) {
				zbirOcena = zbirOcena + ocene[i];
				brojOcena++;
			}
		}
		
		return zbirOcena / brojOcena;				
	}
	
	double izracunajProsekForEach() {
		double zbirOcena = 0;
		int brojOcena = 0;
		
		for(int ocena : ocene) {
			if (ocena != 0) {
				zbirOcena = zbirOcena + ocena;
				brojOcena++;
			}
		}
		
		return zbirOcena / brojOcena;				
	}	

	
	double izracunajProsekSaWhile() {
		double zbirOcena = 0;
		int brojOcena = 0;
		
		int i = 0;
		
		while(ocene[i] != 0) {
			zbirOcena = zbirOcena + ocene[i];
			brojOcena++;
			i++;
		}
		
		return zbirOcena / brojOcena;				
	}		
	
	void pronadjiNajvisuOcenu() {
		int max = 0;
		
		for(int i=0; i<ocene.length; i++) {
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
