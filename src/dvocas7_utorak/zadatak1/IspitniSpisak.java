package dvocas7_utorak.zadatak1;

public class IspitniSpisak {

	private String nazivPredmeta;

	private Student[] studenti;

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		if (nazivPredmeta == null || nazivPredmeta.isEmpty())
			System.out.println("GRESKA");
		else
			this.nazivPredmeta = nazivPredmeta;
	}

	public IspitniSpisak(String nazivPredmeta, int brojStudenata) {
		setNazivPredmeta(nazivPredmeta);

		if (brojStudenata > 0)
			studenti = new Student[brojStudenata];
		else {
			System.out.println("GRESKA");
			studenti = new Student[100];
		}

	}

	public void ispisi() {
		System.out.println(nazivPredmeta);

		/*
		 * for (int i = 0; i < studenti.length; i++) System.out.println( studenti[i] );
		 */

		for (Student s : studenti)
			System.out.println(s);
	}

	public boolean daLiPostoji(Student s) {
		/*
		 * for(int i=0; i<studenti.length;i++) if (studenti[i] != null &&
		 * studenti[i].equals(s)) return true;
		 */

		for (Student student : studenti)
			if (student != null && student.equals(s))
				return true;

		return false;
	}

	public void unesiStudenta(Student s) {
		if (daLiPostoji(s) == true) {
			System.out.println("GRESKA");
		} else {
			for (int i = 0; i < studenti.length; i++)
				if (studenti[i] == null) {
					studenti[i] = s;
					return;
				}

			System.out.println("GRESKA");
		}
	}
	
	public double izracunajProsek() {
		double suma = 0;
		int brojac = 0;
		
		
		for(int i=0;i<studenti.length;i++)
			if (studenti[i]!=null &&
					studenti[i].getOcena() > 5) {
				suma = suma + studenti[i].getOcena();
				brojac++;
			}
		
		
		if (brojac == 0)
			return 0;
		
		return suma / brojac;
	}
	
	public void pronadjiNajvisuOcenu() {
		Student max = null;		
		
		for(int i=0;i<studenti.length;i++)
			if (studenti[i]!=null &&
				(max == null || 
				studenti[i].getOcena() > max.getOcena())) 				
					max = studenti[i];
		
		if (max != null)
			System.out.println( max.getOcena() );
		else
			System.out.println(0);
	}
	
	public double izracunajProlaznost() {
		int polozili = 0;
		int brojac = 0;
		
		
		for(int i=0;i<studenti.length;i++) {
			if (studenti[i]!=null)	brojac++;
			
			if (studenti[i]!=null &&
					studenti[i].getOcena()>5)
				polozili++;
		}
		
		
		if (brojac == 0)
			return 0;
		
		return (100.0*polozili) / brojac;
	}

}
