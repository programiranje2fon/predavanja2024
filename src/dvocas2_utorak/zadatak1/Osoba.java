package dvocas2_utorak.zadatak1;

/*
 
 Klasa predstavlja osobu.
 Osoba ima ime, prezime....
 */
public class Osoba {

	//int  double  float   char  String  boolean (true false)
	
	String ime;
	
	String prezime;
	
	String jmbg;
	
	String adresa;
	
	void ispisi() {
		System.out.println(ime + " " + prezime + ", adresa: " + adresa
				+ ", jmbg: " + jmbg);
	}
	
}
