package dvocas2_utorak.zadatak1;

class Automobil {
	
	String marka;
	
	String model;// null
	
	int kubikaza;// 0
	
	double snaga;// 0.0
	
	String registarskaOznaka;
	
	Osoba vlasnik;
	
	TipGoriva vrstaGoriva;
	
	final double KS_KW = 0.74;
	
	final double KW_KS = 1.34;
	
	Automobil(String marka, String model, int kubikaza, double snaga,
			String registarskaOznaka, Osoba vlasnik, TipGoriva vrstaGoriva){
		this.marka = marka;
		this.model = model;
		this.kubikaza = kubikaza;
		this.snaga = snaga;
		this.registarskaOznaka = registarskaOznaka;
		this.vlasnik = vlasnik;
		this.vrstaGoriva = vrstaGoriva;
	}
	
	Automobil(String marka, String model, int kubikaza, double snaga,
			TipGoriva vrstaGoriva){
		this.marka = marka;
		this.model = model;
		this.kubikaza = kubikaza;
		this.snaga = snaga;
		this.vrstaGoriva = vrstaGoriva;
	}
	
	Automobil(){
		
	}
	
	
	void ispisi() {
		System.out.println("Marka: " + marka);
		System.out.println("Model: " + model);
		System.out.println("Snaga: " + snaga);
		System.out.println("Kubikaza: " + kubikaza);
		System.out.println("Registracija: " + registarskaOznaka);
		System.out.println("Gorivo: " + vrstaGoriva);
		System.out.print("Vlasnik: ");
		vlasnik.ispisi();	
	}
	
	void unesiSnagu(double snaga) {
		// >   <   >=  <=   ==   !=
		// &&   ||   !
		if (snaga >= 10 && snaga <= 800) 
			this.snaga = snaga;
		else
			System.out.println("Snaga je van granica 10-800");
		
		
		/*
		if (snaga < 10 || snaga > 800) 
			System.out.println("Snaga je van granica 10-800");
		else
			this.snaga = snaga;
			*/	
	}

}
