package com.twitter.poruke;

/**
 * 
 * @author Tatjana
 *
 */
public class TwitterPoruka {
	
	/**
	 * Username korisnika
	 */
	private String korisnik;
	
	/**
	 * Tekst poruke
	 */
	private String poruka;
	
	/**
	 * Metoda vraca vrednost atributa korisnik, njegov username.
	 * 
	 * @return username korisnika kao string.
	 * 
	 */
	public String getKorisnik() {
		
		return korisnik;
	}
	
	/**
	 * Metoda postavlja username korisnika na zadatu vrednost iz parametra.
	 * 
	 * @param novi username korisnika.
	 * 
	 * @throws java.lang.RuntimeException ako je unet vrenost null ili prazan String.
	 * 
	 */
	public void setKorisnik(String korisnik) {
		
		if (korisnik==null || korisnik.equals(""))
			throw new RuntimeException("Ime korisnika mora biti uneto");
		
		this.korisnik = korisnik;
	}
	
	/**
	 * Metoda vraca vrednost atributa poruka.
	 * 
	 * @return poruka kao string.
	 * 
	 */
	public String getPoruka() {
		
		return poruka;
	}
	
	/**
	 * Metoda postavlja vrednost poruke na zadatu vrednost iz parametra koji unosimo.
	 * 
	 * @param poruka nova poruka.
	 * 
	 * @throws java.lang.RuntimeException ako poruka ima null vrednost ili vise od 140 karaktera.
	 *  
	 */
	public void setPoruka(String poruka) {
		
		if (poruka==null || poruka.length()>140)
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
	
		this.poruka = poruka;
	}
	
	/**
	 * Metoda vraca vrednosti za korisnika i poruku uz odgovarajuci tekst za njih.
	 * 
	 */
	public String toString(){
		
		return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	}
}
