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
	public void testUnesiKorisnika() {
		newt.unesi("Marica", "Nova poruka.");	
		
		assertEquals("Marica", newt.vratiSvePoruke().getLast().getKorisnik());
		
		
	}
	
	/**
	 * Test method for {@link com.twitter.Twitter#unesi(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUnesiPoruku() {
		newt.unesi("Marica", "Nova poruka.");	
		
		assertEquals("Nova poruka.", newt.vratiSvePoruke().getLast().getPoruka());
		
		
	}

	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testVratiPorukeNull() {
		
		assertEquals(1, null);
		
		
	}
	

	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testVratiPorukeEmpty() {
		
		assertEquals(1, "");
		
		
	}

}
