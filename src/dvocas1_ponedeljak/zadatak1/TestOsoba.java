package dvocas1_ponedeljak.zadatak1;

public class TestOsoba {

	public static void main(String[] args) {
		Osoba nekaOsoba = new Osoba(); // kreiranja objekta klase osoba
		nekaOsoba.ime = "Pera"; // dodeljivanje vrednosti atributu
		nekaOsoba.prezime = "Peric";
		nekaOsoba.godinaRodjenja = 2003;
		nekaOsoba.uBraku = false;
		nekaOsoba.godisnjaPrimanja = 2345426.12;
		nekaOsoba.pol = 'M';
		
		nekaOsoba.ispisi(); // poziv metode objekta imeObjekta.imeMetode();
	
		int starost = nekaOsoba.izracunajStarost(2024);
		System.out.println("Starost: "+starost);
		
	}

}
