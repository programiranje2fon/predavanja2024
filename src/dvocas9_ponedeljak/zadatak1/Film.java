package dvocas9_ponedeljak.zadatak1;

import java.util.Objects;

public class Film {
	private String naslov;
	private String reziser;
	private int godina;
	
	
	
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		
		if (naslov == null) {
			//System.out.println("Nedozvoljena vrednost za naslov! Ne sme biti null ili prazan string");
			throw new IllegalArgumentException("Nedozvoljena vrednost za naslov! Ne sme biti null");
		} else if (naslov.isEmpty()) {
			throw new FilmException("Nedozvoljena vrednost za naslov! Ne sme biti prazan string");
		} else {
			this.naslov = naslov;
		}
	}
	public String getReziser() {
		return reziser;
	}
	public void setReziser(String reziser) {
		if (reziser == null || reziser.isEmpty()) {
			System.out.println("Nedozvoljena vrednost za naslov! Ne sme biti null ili prazan string");
		} else {
			this.reziser = reziser;
		}
	}
	public int getGodina() {
		return godina;
	}
	public void setGodina(int godina) throws Exception {
		if (godina <=1892) {
			throw new Exception("Nedozvoljena godina: "+godina);
		} else {
			this.godina = godina;
		}
	}
	@Override
	public String toString() {
		return "Film [naslov=" + naslov + ", reziser=" + reziser + ", godina=" + godina + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(godina, naslov, reziser);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return godina == other.godina && Objects.equals(naslov, other.naslov) && Objects.equals(reziser, other.reziser);
	}
	
	
	
	

	

}
