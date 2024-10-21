package dvocas2_ponedeljak.zadatak1;

public class Automobil {
	String marka;
	String model;
	int kubikaza;
	double snaga;
	String registarskaOznaka;
	Osoba vlasnik;
	VrstaGoriva vrstaGoriva;
	
	final double KS_KW = 0.74;
	final double KW_KS = 1.34;
	
	// konstruktor bez parametara
/*	public Automobil() {
		
	}*/
	
	
	public Automobil(String marka, String model) {
		this.marka = marka;
		this.model = model;
	}
	
	// konstruktor sa parametarima
	public Automobil(String marka, String model,
					int kubikaza, double snaga,
					String regOzn, Osoba vlasnik, VrstaGoriva vrstaG) {
		
		proveriSnagu(snaga);
		
		this.marka = marka;
		this.model = model;
		this.kubikaza = kubikaza;
		this.snaga = snaga;		
		registarskaOznaka = regOzn;
		this.vlasnik = vlasnik;
		vrstaGoriva = vrstaG;
			
	}	
	
	public void ispisi() {
		double snaga_ks = snaga * KW_KS;
		System.out.println("Podaci o automobilu");
		System.out.println("Marka: "+marka);
		System.out.println("Model: "+model);
		System.out.println("Kubikaza: "+kubikaza);
		System.out.println("Snaga: "+snaga+ "KW ("+snaga_ks+"KS)");
		System.out.println("Registarska oznaka: "+registarskaOznaka);
		//System.out.println("Vlasnik: "+vlasnik);
		System.out.println("Vrsta goriva: "+vrstaGoriva);
		System.out.println("Vlasnik: ");
		if (vlasnik != null) { 
			vlasnik.ispisi();
		} else {
			System.out.println("Nema podataka o vlasniku");
		}
	}
	
	public void proveriSnagu(double nekaSnaga) {
		if (nekaSnaga<10 || nekaSnaga>800) {
			System.out.println("Snaga je van dozvoljenog raspona vrednosti");
		} else {
			System.out.println("Podaci su validni");
		}
	}
	

}
