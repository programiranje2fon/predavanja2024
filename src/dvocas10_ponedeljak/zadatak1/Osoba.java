package dvocas10_ponedeljak.zadatak1;

import java.util.Objects;

public class Osoba {
	private String imePrezime;
	private String adresa;
	private int telefon;
	
	public String getImePrezime() {		
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		if (imePrezime == null || imePrezime.isEmpty()) {
			throw new RuntimeException("Greska: ime i prezime ne smeju biti null ili prazan string!");
		} else {
			this.imePrezime = imePrezime;
		}
	}
	
	public String getAdresa() {
		return adresa;
	}
	
	public void setAdresa(String adresa) {
		if (adresa == null || adresa.isEmpty()) {
			throw new RuntimeException("Greska: adresa ne sme biti null ili prazan string!");
		} else {		
			this.adresa = adresa;
		}
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		if (telefon<0 || telefon>999999) {
			throw new RuntimeException("Greska: neispravan telefon!");
		} else {
			this.telefon = telefon;
		}
	}

	@Override
	public String toString() {
		return "Osoba [imePrezime=" + imePrezime + ", adresa=" + adresa + ", telefon=" + telefon + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(adresa, imePrezime, telefon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		return Objects.equals(imePrezime, other.imePrezime);
	}
	
	
	
}
