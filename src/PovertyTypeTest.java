import static org.junit.Assert.*;

import org.junit.Test;

public class PovertyTypeTest {

	@Test
	public void testGetSetRange() {
		PovertyType pt = new PovertyType(); 
		pt.setRange("60");
		assertEquals("60", pt.getRange()); 
	}
	
	@Test
	public void testToString() {
		PovertyType pt = new PovertyType(); 
		pt.setRange("60");
		assertEquals("PovertyType [range=60]", pt.toString()); 
	}

}
