package vladimir.tosic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {

		/*
		 * 1. Због чега се ради серијализација и десеријализација објекта?
		 * 
		 * Serijalizacija je pretvaranje objekata u niz bajtova. Ovi podaci se cuvaju
		 * unutar datoteke, memorije ili se prenose preko mreze tj servera. Atributi
		 * (polja) serijalizabilnih potklasa ce biti inicijalizovani iz odgovarajuceg
		 * toka. Deserijalizacija je obrnut proces gde se niz bajtova koristi za
		 * rekonstruisanje objekata. Svrha ovoga je da se objekat kreiran unutar jednog
		 * projekta moze rekonstruisati u drugom projektu.
		 * 
		 * 
		 * 2. Које класе омогућују серијализацију и десеријализацију објеката?
		 * 
		 * ObjectInputStream I ObjectOutputStream su klase tj tokovi koji sadrze metode
		 * za serijalizaciji I deserijalizaciju objekata. Metoda
		 * ObjectOutputStream.writeObject() omogucuje upisivanje objekta (u fajl npr.).
		 * Ona je unutar klase za serijalizaciju. Metoda ObjectInputStream.readObject()
		 * omogucava rekonstrukciju objekta iz fajla tj. vraca sacuvano stanje objekta.
		 * Ona je unutar klase za deserijalizaciju.
		 * 
		 */
		
		
		// Kreiranje objekta serijalizabilne klase LicnaKarta
		LicnaKarta lk = new LicnaKarta();
		
		lk.ime = "Vladimir";
		lk.prezime = "Tosic";
		lk.brojLicneKarte = "004568987";
		
		// Kreiranje toka za upis podataka u fajl PodaciOLicnoj.ser
	
		FileOutputStream fos = new FileOutputStream("PodaciOLicnoj.ser");
		
		
		/* Kreiranje objekta klase ObjectOutputStream pomocu cije metode write() 
		 * cemo serijalizovati objekat u fajl u vidu niza bajtova
		*/
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// Pozivanje metode writeObject()
		oos.writeObject(lk);

		oos.close();
		fos.close();

		System.out.println("Podaci o licnoj karti su sacuvani. ");
		System.out.println("Ime: " + lk.ime);
		System.out.println("Prezime: " + lk.prezime);
		System.out.println("Broj licne karte: " + lk.brojLicneKarte);

	}

}
