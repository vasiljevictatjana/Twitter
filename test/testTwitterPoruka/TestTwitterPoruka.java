/**
 * 
 */
package testTwitterPoruka;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

/**
 * @author Tatjana
 *
 */
public class TestTwitterPoruka {
	
	private TwitterPoruka newtp;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		newtp = new TwitterPoruka();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	
		newtp = null;
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test
	public void testSetKorisnik() {
		
		newtp.setKorisnik("Pera");
		
		assertEquals("Pera", newtp.getKorisnik());
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		
		newtp.setKorisnik(null);
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikPrazanString() {
		
		newtp.setKorisnik("");
	}
	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test
	public void testSetPoruka() {
		
		newtp.setPoruka("Nova poruka");
		
		assertEquals("Nova poruka", newtp.getPoruka());
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		
		newtp.setPoruka(null);		
	}
	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPorukaPorukaDuzaOd140Znakova() {
		
		newtp.setPoruka("Poruka duza od 140 znakova ne moze da stane.Poruka duza od 140 znakova ne moze da stane."
				+ "Poruka duza od 140 znakova ne moze da stane.Poruka duza od 140 znakova ne moze da stane."
				+ "Poruka duza od 140znakova ne moze da stane.Poruka duza od 140 znakova ne moze da stane."
				+ "Poruka duza od 140znakova ne moze da stane.Poruka duza od 140 znakova ne moze da stane."
				+ "Poruka duza od 140znakova ne moze da stane.Poruka duza od 140 znakova ne moze da stane.");

	}
	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
		
		newtp.setPoruka("Nova poruka");
		newtp.setKorisnik("Mila");
		
		assertEquals("KORISNIK:Mila PORUKA:Nova poruka", newtp.toString());	}

}
