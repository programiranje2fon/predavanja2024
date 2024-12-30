package dvocas9_ponedeljak.zadatak1;

public class TestFilm {

	public static void main(String[] args) {
		Film nekiFilm = new Film();
		
		nekiFilm.setNaslov("Neki naslov");

		
		try {
			nekiFilm.setGodina(1904);
			System.out.println("Broj znakova u naslovu: "+nekiFilm.getNaslov().length());
			System.out.println("12 znak: "+nekiFilm.getNaslov().charAt(12));
		} catch(Exception re) {
			System.out.println("Doslo je do greske: "+re.getMessage());
			//re.printStackTrace();
		}
		/*catch(NullPointerException ex) {
			System.out.println("Doslo je do greske");
		} catch(StringIndexOutOfBoundsException se) {
			System.out.println("Greska: prekoracenje indeksa stringa");
		}*/
		
		
		System.out.println("Program i dalje radi");
		/*
		String str = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		while(true) {
			str=str+str;
		}
		*/
		
		Film film2 = new Film();
		film2.setNaslov("Blade runner");
		try {
			film2.setGodina(1982);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		film2.setReziser("Ridley Scot");
		
		EnciklopedijaFilmova enciklopedija = new EnciklopedijaFilmova();
		enciklopedija.dodajFilm(nekiFilm);
		enciklopedija.dodajFilm(film2);
		enciklopedija.ispisi();
		enciklopedija.obrisiFilm(nekiFilm);
		enciklopedija.ispisi();
		
	}

}
