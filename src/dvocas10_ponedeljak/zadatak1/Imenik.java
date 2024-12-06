package dvocas10_ponedeljak.zadatak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Imenik {
	private List<Osoba> osobe = new ArrayList<>();
	
	public void ucitajOsobu() {
		Osoba osoba = new Osoba();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Unesite ime i prezime: ");
			String imePrezime = br.readLine();
			osoba.setImePrezime(imePrezime);

			System.out.print("Unesite adresu: ");
			String adresa = br.readLine();
			osoba.setAdresa(adresa);
			
			System.out.print("Unesite telefon: ");
			String telefonStr = br.readLine();
			int telefon = Integer.parseInt(telefonStr);
			osoba.setTelefon(telefon);			
			
			if (!osobe.contains(osoba)) {
				osobe.add(osoba);
			} else {
				throw new RuntimeException("Osoba vec postoji u imeniku: "+osoba);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void pronadjiOsobu() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Unesite rec za pretragu:");
			String deoImena = br.readLine();
			System.out.println("Rezultati pretrage za: "+deoImena);
			for(Osoba osoba : osobe) {
				if(osoba.getImePrezime().contains(deoImena)) {
					System.out.println(osoba);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void ispisi() {
		System.out.println("Sadrzaj imenika:");
		System.out.println("----------------");
		for(Osoba osoba : osobe) {
			System.out.println(osoba);
		}
	}
	
}
