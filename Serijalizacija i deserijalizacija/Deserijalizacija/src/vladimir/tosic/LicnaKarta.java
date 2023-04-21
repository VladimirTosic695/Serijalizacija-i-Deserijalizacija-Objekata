package vladimir.tosic;

import java.io.Serializable;

public class LicnaKarta implements Serializable {

	
	String ime, prezime, brojLicneKarte;

	// Podrazumevani konstruktur
	LicnaKarta() {

	}

	// Parametrizovan konstruktor
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
