package dvocas1_ponedeljak.zadatak1;

/*
 * Ovo je klasa Osoba koja sadrzi osnovne podatke o nekoj osobi
 * Ovo je komentar u vise redova 
 */
public class Osoba {
	String ime; // ovo je ime osobe i komentar u jednom redu
	String prezime; // ovo je prezime osobe
	char pol;
	int godinaRodjenja;
	boolean uBraku;
	double godisnjaPrimanja;
	
	
	public void ispisi() {
		System.out.println("Ime: "+ime);
		System.out.println("Prezime: "+prezime);
		System.out.println("Pol: "+pol);		
		System.out.println("Godina rodjenja: "+godinaRodjenja);
		System.out.println("U braku: "+uBraku);
		System.out.println("Godisnja primanja: "+godisnjaPrimanja);
	}
	
	public int izracunajStarost(int godina) {
		int starost = godina - godinaRodjenja;
		
		return starost;
	}
		
}
