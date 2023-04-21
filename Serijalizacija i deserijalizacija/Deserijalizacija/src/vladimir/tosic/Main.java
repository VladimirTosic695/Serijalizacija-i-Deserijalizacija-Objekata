package vladimir.tosic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		/*
		 * Kod deserijalizacije potrebno je prvo izvrsiti deklaraciju objekta(bez inicijalizacije)
		 */
		LicnaKarta lk;
		
		// Kreiranje tokova 
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Vladimir\\Desktop\\Praksa\\PrimerSerijalizacije\\PodaciOLicnoj.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// Citanje podataka i prevodjenje istih iz bajtova u LicnuKartu
		
		lk = (LicnaKarta) ois.readObject();
		
		fis.close();
		ois.close();
		
		// Ispisivanje podataka
		
		System.out.println("Ime: " + lk.ime);
		System.out.println("Prezime: " + lk.prezime);
		System.out.println("Broj licne karte: " + lk.brojLicneKarte);

	}

}
