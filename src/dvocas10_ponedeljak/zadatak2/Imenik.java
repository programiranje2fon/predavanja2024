package dvocas10_ponedeljak.zadatak2;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import dvocas10_ponedeljak.zadatak1.Osoba;

public class Imenik {
	private List<Osoba> osobe = new ArrayList<>();

	public void ucitajOsobu() {
		Osoba osoba = new Osoba();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Unesite ime i prezime: ");
		String imePrezime = scanner.nextLine();
		osoba.setImePrezime(imePrezime);

		System.out.print("Unesite adresu: ");
		String adresa = scanner.nextLine();
		osoba.setAdresa(adresa);

		System.out.print("Unesite telefon: ");
		int telefon = scanner.nextInt();
		osoba.setTelefon(telefon);

		if (!osobe.contains(osoba)) {
			osobe.add(osoba);
		} else {
			throw new RuntimeException("Osoba vec postoji u imeniku: " + osoba);
		}

	}

	public void pronadjiOsobu() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Unesite rec za pretragu:");
		String deoImena = scanner.nextLine();
		System.out.println("Rezultati pretrage za: " + deoImena);
		for (Osoba osoba : osobe) {
			if (osoba.getImePrezime().contains(deoImena)) {
				System.out.println(osoba);
			}
		}
	}

	public void ispisi() {
		System.out.println("Sadrzaj imenika:");
		System.out.println("----------------");
		for (Osoba osoba : osobe) {
			System.out.println(osoba);
		}
	}

}
