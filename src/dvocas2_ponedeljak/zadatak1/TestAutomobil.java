package dvocas2_ponedeljak.zadatak1;

public class TestAutomobil {

	public static void main(String[] args) {
		Osoba vlasnik = new Osoba();
		vlasnik.ime ="Zika";
		vlasnik.prezime = "Zikic";
		vlasnik.jmbg = "123456789807";
		vlasnik.adresa = "Kolarceva 8";
						
		Automobil auto = new Automobil("Nissan", "Micra", 1199, 50.5,
										"NS 567 HH", vlasnik, VrstaGoriva.BENZIN);
	
		/*
		auto.marka = "Nissan";
		auto.model = "Micra";
		auto.kubikaza = 1199;
		auto.snaga = 50.5;
		auto.registarskaOznaka = "NS 567 HH";
		auto.vlasnik ="Zika Zikic";
		auto.vrstaGoriva = VrstaGoriva.BENZIN;
		*/
		
		auto.ispisi();
		
		Automobil auto2 = new Automobil("Fiat", "Punto");
		auto2.ispisi();
				

	}

}
