package dvocas9_ponedeljak.zadatak1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnciklopedijaFilmova {
	private List<Film> filmovi = new ArrayList<>();
	
	public void dodajFilm(Film film) {
		if (!filmovi.contains(film)) {
			filmovi.add(film);
		} else {
			throw new FilmException("Film vec postoji!");
		}
	}
	
	public void obrisiFilm(Film film) {
		filmovi.remove(film);
	}
	
	public void ispisi() {
		for(int i=0; i<filmovi.size(); i++) {
			System.out.println(filmovi.get(i));
		}
		/*
		for(Film f : filmovi) {
			System.out.println(f);
		}
		
		Iterator<Film> it = filmovi.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
	}
	
	
	public void pronadjiFilm(String deoNaslova) {
		for(Film f : filmovi) {
			if (f.getNaslov().contains(deoNaslova)) {
				System.out.println(f);
			}
		}
		/*
		Iterator<Film> it = filmovi.iterator();
		while(it.hasNext()) {
			Film f = it.next();
			if (f.getNaslov().contains(deoNaslova)) {
				System.out.println(f);
			}
		}
		*/
	}
	
	
	
	
	
}
