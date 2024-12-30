package dvocas10_utorak.zadatak2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Imenik im = new Imenik();
		
		while (true) {
			System.out.println("Dobrodosli u imenik");
			System.out.println("-------------------");
			System.out.println("Ponudjene opcije:");
			System.out.println("1 - Unos osobe u imenik");
			System.out.println("2 - Pretraga imenika");
			System.out.println("3 - Ispis celog imenika");
			System.out.println("4 - Izlaz iz programa");
			System.out.println("-------------------");
			System.out.print("Unesite opciju: ");
			
			Scanner sc = new Scanner(System.in);
			int opcija = sc.nextInt();
			
			switch(opcija) {
				case 1: im.ucitajOsobu();break;
				case 2: im.pronadjiOsobu();break;
				case 3: im.ispisi();break;
				case 4: System.out.println("Hvala sto ste koristili imenik");return;
				default: System.err.println("Morate uneti broj u rasponu od 1 do 4");
			}
		}

	}

}
