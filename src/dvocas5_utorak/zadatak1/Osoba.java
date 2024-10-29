package dvocas5_utorak.zadatak1;

class Osoba {
	
	String ime = "nepoznato";// "ABBA"  "A"   'A'
	
	String prezime = new String("nepoznato");
	
	String adresa;
	
	void postaviIme(String ime) {
		if (ime == null || ime.isEmpty())
			System.out.println("GRESKA");
		else
			this.ime = ime.trim();
	}
	
	void postaviPrezime(String prezime) {
		if (prezime == null || prezime.equals(""))
			System.out.println("GRESKA");
		else
			this.prezime = prezime.trim();
	}
	
	void postaviAdresu(String adresa) {
		if (adresa == null || 
				adresa.length() < 5 ||
			(adresa.indexOf(';') == adresa.lastIndexOf(';')))
			System.out.println("GRESKA");
		else
			this.adresa = adresa.trim();
	}
	
	
	void ispisi() {
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		
		/*String ulica = adresa.substring(0, adresa.indexOf(';'));
		
		String broj = adresa.substring(adresa.indexOf(';')+1, 
										adresa.lastIndexOf(';'));
		
		String grad = adresa.substring(adresa.lastIndexOf(';')+1);
		
		System.out.println("Ulica: " + ulica);
		System.out.println("Broj: " + broj);
		System.out.println("Grad: " + grad);*/
		
		String[] deloviAdrese = adresa.split(";");
		
		System.out.println("Ulica: " + deloviAdrese[0]);
		System.out.println("Broj: " + deloviAdrese[1]);
		System.out.println("Grad: " + deloviAdrese[2]);
		
	}
	
	void istaAdresa(String ulica, String broj, String grad) {
		//String adresa2 = ulica + ";" + broj + ";" + grad;
		StringBuilder adresaBuilder = new StringBuilder();
		adresaBuilder.append(ulica);
		adresaBuilder.append(";");
		adresaBuilder.append(broj);
		adresaBuilder.append(';');
		adresaBuilder.append(grad);
		
		String adresa2 = adresaBuilder.toString();
		
		
		if (adresa.equalsIgnoreCase(adresa2)) {
			System.out.println("potpuno ista adresa");
			return;
		}
		
		if (adresa.endsWith(grad)) {
			System.out.println("samo isti grad");
			return;
		}
		
		System.out.println("nije ista adresa");
	}
	
	

}
