package dvocas10_utorak.zadatak2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dvocas10_utorak.zadatak1.Osoba;

public class Imenik {
	
	private List<Osoba> osobe = new ArrayList<Osoba>();
	
	//BufferedReader   Scanner
	//System.out.println
	//System.err.println
	//System.in
	public void ucitajOsobu() {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Unesite ime i prezime: ");
			String imePrezime = sc.nextLine();
			
			System.out.print("Unesite adresu: ");
			String adresa = sc.nextLine();
		
			System.out.print("Unesite telefon: ");
			int telefon = sc.nextInt();
			
			Osoba os = new Osoba();
			os.setImePrezime(imePrezime);
			os.setAdresa(adresa);
			os.setTelefon(telefon);
			
			if (!osobe.contains(os))
				osobe.add(os);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void pronadjiOsobu() {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Unesite deo imena ili prezimena: ");
			String deoImena = sc.nextLine();
			
			System.out.println("Rezultati pretrage");
			System.out.println("-------------------------");
			
			for(Osoba os: osobe)
				if (os.getImePrezime().contains(deoImena))
					System.out.println(os);
			
			System.out.println("-------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ispisi() {
		System.out.println("Sadrzaj imenika");
		System.out.println("-------------------------");
		
		for(Osoba o: osobe)
			System.out.println(o);
		
		System.out.println("-------------------------");
	}

}
