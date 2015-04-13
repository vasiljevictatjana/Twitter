/**
 * 
 */
package testTwitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.Twitter;
import com.twitter.poruke.TwitterPoruka;

/**
 * @author Tatjana
 *
 */
public class TestTwitter {
	
	private Twitter newt;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		newt = new Twitter();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		newt=null;
	}

	/**
	 * Test method for {@link com.twitter.Twitter#vratiSvePoruke()}.
	 */
	@Test
	public void testVratiSvePoruke() {
		LinkedList<TwitterPoruka> poruke = new LinkedList<TwitterPoruka>();
		
		assertEquals(poruke, newt.vratiSvePoruke());
		
	}

	/**
	 * Test method for {@link com.twitter.Twitter#unesi(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUnesiKorisnikaPoruku() {
		newt.unesi("Marica", "Nova poruka 1.");	
			
		assertEquals("Marica", newt.vratiSvePoruke().getLast().getKorisnik());
		assertEquals("Nova poruka 1.", newt.vratiSvePoruke().getFirst().getPoruka());
		
		
	}
	
	/**
	 * Test method for {@link com.twitter.Twitter#unesi(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUnesiKorisnikaPorukuPrazno() {
		newt.unesi("Marica", "Nova poruka 1.");	

		
		assertEquals("Marica", newt.vratiSvePoruke().getLast().getKorisnik());
		assertEquals(false, newt.vratiSvePoruke().isEmpty());
		assertEquals("Nova poruka 1.", newt.vratiSvePoruke().getFirst().getPoruka());
		
		
	}


	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testVratiPorukeNull() {
		
		newt.vratiPoruke(1, null);
		
		
	}
	

	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testVratiPorukeEmpty() {
		
		newt.vratiPoruke(1, "");
	}


}
