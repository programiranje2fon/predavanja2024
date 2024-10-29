package dvocas5_utorak.zadatak1;

public class TestOsoba {

	public static void main(String[] args) {
		Osoba o = new Osoba();
		
		o.postaviIme("Pera");
		o.postaviPrezime("Peric");
		o.postaviAdresu("Jove Ilića;154;Beograd");
		
		o.ispisi();
	}

}
