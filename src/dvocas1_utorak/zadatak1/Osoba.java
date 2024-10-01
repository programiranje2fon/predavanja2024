package dvocas1_utorak.zadatak1;

/*
 
 Klasa predstavlja osobu.
 Osoba ima ime, prezime....
 */
public class Osoba {

	//int  double  float   char  String  boolean (true false)
	
	int godinaRodjenja;
	
	String ime;
	
	String prezime;
	
	//da li osoba u braku (true) ili nije (false)
	boolean uBraku;
	
	char pol;
	
	void ispisi() {
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("Godina: " + godinaRodjenja);
		System.out.println("Pol: " + pol);
		System.out.println("U braku: " + uBraku);
	}
	
	int izracunajStarost(int trenutnaGodina) {
		return trenutnaGodina - godinaRodjenja;
	}
	
}
