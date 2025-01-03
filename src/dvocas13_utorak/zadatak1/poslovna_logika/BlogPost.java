package dvocas13_utorak.zadatak1.poslovna_logika;

import java.time.LocalDateTime;
import java.io.*;

public class BlogPost implements Serializable {
	
	private static final long serialVersionUID = -3824103273662213983L;

	private String naslov;
	
	private String sadrzaj;
	
	private LocalDateTime datum;
	
	public BlogPost() {
		datum = LocalDateTime.now();
	}
	
	// apsolutna putanja 
	//c:/Users/student2/eclipse-workspace/Predavanja2024/blog_post.txt
	// relativna putanja
	// blog_post.txt
	// src/dvocas11_utorak/tekst_zadatka.md
	public BlogPost(String fajl) {
		datum = LocalDateTime.now();
		
		try (BufferedReader br = 
					new BufferedReader(
							new FileReader(fajl));){
			
			String naslov = br.readLine();
			setNaslov(naslov);
			
			String sadrzaj = "";
			
			while (true) {
				String red = br.readLine();
				
				if (red == null)
					break;
				
				sadrzaj = sadrzaj + red + System.lineSeparator();
			}
			
			setSadrzaj(sadrzaj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		if (naslov == null || naslov.isEmpty())
			throw new IllegalArgumentException("Naslov ne sme biti null ili prazan");
		
		this.naslov = naslov;
	}

	public String getSadrzaj() {
		return sadrzaj;
	}

	public void setSadrzaj(String sadrzaj) {
		if (sadrzaj == null || sadrzaj.isEmpty())
			throw new IllegalArgumentException("Sadrzaj ne sme biti null ili prazan");
		
		this.sadrzaj = sadrzaj;
	}

	public LocalDateTime getDatum() {
		return datum;
	}

	public void setDatum(LocalDateTime datum) {
		if (datum == null)
			throw new NullPointerException("Datum ne sme biti null");
		
		this.datum = datum;
	}

	@Override
	public String toString() {
		return datum + System.lineSeparator() +
				System.lineSeparator() + naslov +
				System.lineSeparator() +
				System.lineSeparator() + sadrzaj;
	}

}
