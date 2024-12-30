package dvocas10_utorak.zadatak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Imenik {
	
	private List<Osoba> osobe = new ArrayList<Osoba>();
	
	//BufferedReader   Scanner
	//System.out.println
	//System.in
	public void ucitajOsobu() {
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
		
		try {
			System.out.print("Unesite ime i prezime: ");
			String imePrezime = br.readLine();
			
			System.out.print("Unesite adresu: ");
			String adresa = br.readLine();
		
			System.out.print("Unesite telefon: ");
			//Double Integer Boolean
			int telefon = Integer.parseInt( br.readLine() );// "123" -> parse -> 123
			
			Osoba os = new Osoba();
			os.setImePrezime(imePrezime);
			os.setAdresa(adresa);
			os.setTelefon(telefon);
			
			if (!osobe.contains(os))
				osobe.add(os);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void pronadjiOsobu() {
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
		
		try {
			System.out.print("Unesite deo imena ili prezimena: ");
			String deoImena = br.readLine();
			
			System.out.println("Rezultati pretrage");
			System.out.println("-------------------------");
			
			for(Osoba os: osobe)
				if (os.getImePrezime().contains(deoImena))
					System.out.println(os);
			
			System.out.println("-------------------------");
		} catch (IOException e) {
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
