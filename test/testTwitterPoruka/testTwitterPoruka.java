package testTwitterPoruka;

import com.twitter.poruke.TwitterPoruka;

import junit.framework.TestCase;

public class testTwitterPoruka extends TestCase {
	
	private TwitterPoruka newtp;
	
	
	protected void setUp() throws Exception {
		newtp = new TwitterPoruka();
	}
	
	
	protected void tearDown() throws Exception {
		newtp = null;;
	}

	
	public void testSetKorisnik() {
		newtp.setKorisnik("Marica");
		
		assertEquals("Marica", newtp.getKorisnik());
	}


	public void testSetPoruka() {
		newtp.setPoruka("Nova poruka.");
		
		assertEquals("Nova poruka.", newtp.getPoruka());
		
	}

	public void testToString() {
		newtp.setKorisnik("Marica");
		newtp.setPoruka("Nova poruka.");
		
		assertEquals("KORISNIK:Marica PORUKA:Nova poruka.", newtp.toString());
		
	}

}
