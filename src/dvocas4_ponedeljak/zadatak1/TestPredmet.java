package dvocas4_ponedeljak.zadatak1;

public class TestPredmet {

	public static void main(String[] args) {
		Predmet predmet = new Predmet("Programiranje 1", 10);
		// predmet.naziv = "Neki naziv";
		predmet.unesiOcenu(10);
		predmet.unesiOcenu(10);
		predmet.unesiOcenu(8);
		predmet.unesiOcenu(9);
		predmet.unesiOcenu(5);
		predmet.unesiOcenu(7);
		predmet.ispisiSaForEach();
		
		double prosek  = predmet.izracunajProsek();
		
		System.out.println("Prosek:" + prosek);

		predmet.pronadjiNajvisuOcenu();
		predmet.izracunajProlaznost();
 	}
	


}
