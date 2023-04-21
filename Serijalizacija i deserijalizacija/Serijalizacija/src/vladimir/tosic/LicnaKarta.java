package vladimir.tosic;

import java.io.Serializable;

/*3. Интерфејс Serializable – објаснити и имплементирати. 
* 
* Klasa LicnaKarta implemetira interfejs Serializable. 
* Klasa za serijalizaciju i sve potklase moraju implemntirati ovaj interfejs.
* On nema nijednu metodu za implementaciju. 
*/

public class LicnaKarta implements Serializable {

	/**
	 * SerijalVersionUID je jedinstveni identifikator klase tokom serijalizacije i deserijalizacije.
	 * Koristi se da bi se proverilo da li serijalizator (posaljilac) i deserijalizator (prijemnik) 
	 * imaju kompatibilne klase za objekat koji se salje.
	 * Ukoliko nemaju doci ce do izuzetka InvalidClassException 
	 */
	private static final long serialVersionUID = 1L;
	String ime, prezime, brojLicneKarte;

	// Podrazumevani konstruktur
	LicnaKarta() {

	}

	// Parametrizovan konstruktur
	LicnaKarta(String ime, String prezime, String brojLicneKarte) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojLicneKarte = brojLicneKarte;
	}

	// Geteri
	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getBrojLicne() {
		return brojLicneKarte;
	}

}
