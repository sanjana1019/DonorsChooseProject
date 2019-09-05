import static org.junit.Assert.*;

import org.junit.Test;

public class SubjectTest {

	@Test
	public void testSetGetName() {
		Subject s = new Subject(); 
		s.setName("Art");
		assertEquals("Art", s.getName());
	}
	
	@Test
	public void testToString() {
		Subject s = new Subject(); 
		s.setName("Art");
		assertEquals("Subject [name=Art]", s.toString());
		
	}
	
}
