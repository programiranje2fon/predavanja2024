package dvocas10_ponedeljak.zadatak2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Imenik imenik = new Imenik();
		Scanner scanner = new Scanner(System.in);
		
		int izbor = 0;
		
		while(izbor!=4) {
			System.out.println("Meni:");
			System.out.println("1 - Unos osobe u imenik");
			System.out.println("2 - Pretraga imenika");
			System.out.println("3 - Ispis celog imenika");
			System.out.println("4 - Izlaz iz programa");
			
			izbor = scanner.nextInt();
			
			switch(izbor) {
				case 1:
					imenik.ucitajOsobu();
					break;
				case 2: 
					imenik.pronadjiOsobu();
					break;
				case 3:
					imenik.ispisi();
					break;
				case 4:
					System.out.println("Dovidjenja, hvala sto ste koristili imenik!");
					break;
				default:
					System.out.println("Pogresan unos, pokusajte ponovo");
					break;
			}
		}

	}

}
