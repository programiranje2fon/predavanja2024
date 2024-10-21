package dvocas3_ponedeljak.zadatak1;

public class TestIspisivac {

	public static void main(String[] args) {
		Ispisivac isp = new Ispisivac();
		isp.ispisiOcenuSaSwitch(3);
		
		Ispisivac.ispisiOcenu(5); // poziv staticke metode - Nazivklase.nazivmnetode();

		isp.prosecnaOcena = 3.57f;
		
		Ispisivac isp2 = new Ispisivac();
		System.out.println("Prosecna ocena drugog objekta:" + isp2.prosecnaOcena);
		
//		int broj = Integer.parseInt("345");
		//System.out.println(String.valueOf(123.56)+1);
		
		isp.ispisiZdravoSaFor();
		
		Ispisivac.ispisiPoruku("Dobro jutro!");
		Ispisivac.ispisiPoruku("Dobar dan", 3);
		Ispisivac.ispisiBrojeveOd1Do20();
		
		Ispisivac.vremeDupliranja(12000, 0.05);
	}

}
