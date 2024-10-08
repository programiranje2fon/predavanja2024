package dvocas2_utorak.zadatak1;

public class TestAutomobil {

	public static void main(String[] args) {
		Osoba o = new Osoba();
		
		o.ime = "Zika";
		o.prezime = "Zikic";
		o.jmbg = "4234234234";
		o.adresa = "Jove Ilica 154";
		
		Automobil a = new Automobil("Nisan","Micra",1199,50.5,
				"NS-567-HH",o ,TipGoriva.BENZIN);
		
		a.ispisi();
		
		Automobil a2 = new Automobil();
		
		a2.marka = "Opel";
		a2.model = "Corsa";
		a2.kubikaza = 1399;
		a2.snaga = 55;
		a2.registarskaOznaka = "BG 123 RR";
		a2.vlasnik = o;
		
		a2.vlasnik.ime = "Pera";
		
		
		a2.vrstaGoriva = TipGoriva.DIZEL;
		
		
		a2.ispisi();
		

	}

}
