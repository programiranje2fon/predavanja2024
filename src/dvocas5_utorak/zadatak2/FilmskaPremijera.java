package dvocas5_utorak.zadatak2;

import java.time.LocalDateTime;

class FilmskaPremijera {
	
	String nazivFilma;
	
	LocalDateTime premijeraAmerika = 
			LocalDateTime.now();

	LocalDateTime premijeraSvet = 
			LocalDateTime.of(2024, 3, 23, 21, 0);
	
	void postaviNaziv(String naziv) {
		if (naziv == null || naziv.isEmpty())
			System.out.println("GRESKA");
		else
			nazivFilma = naziv.trim();
	}
	
	void postaviDatumePremijera(LocalDateTime amerika,
			LocalDateTime svet) {
		LocalDateTime sada = LocalDateTime.now();
		
		
		if (amerika == null || svet == null ||
				amerika.isBefore(sada) || svet.isBefore(sada))
			System.out.println("GRESKA");
		else {
			premijeraAmerika = amerika;
			premijeraSvet = svet;
		}
	}
	
	void ispisi() {
		System.out.println("Naziv: " + nazivFilma);
		
		int godinaA = premijeraAmerika.getYear();
		int mesecA = premijeraAmerika.getMonthValue();
		int danA = premijeraAmerika.getDayOfMonth();
		int satA = premijeraAmerika.getHour();
		int minA = premijeraAmerika.getMinute();
		
		String amerika = danA + "." + mesecA + "." + godinaA+
				". "+ satA + ":" + minA;
		
		System.out.println("Premijera Amerika: " + amerika);
		
		int godinaS = premijeraSvet.getYear();
		int mesecS = premijeraSvet.getMonthValue();
		int danS = premijeraSvet.getDayOfMonth();
		int satS = premijeraSvet.getHour();
		int minS = premijeraSvet.getMinute();
		
		String svet = danS + "." + mesecS + "." + godinaS+
				". "+ satS + ":" + minS;
		
		System.out.println("Premijera svet: " + svet);
		
	}
	
	void pomeriPremijere() {
		premijeraAmerika = premijeraAmerika.plusYears(1);
		premijeraSvet = premijeraSvet.plusYears(1);
	}
	
	
}
