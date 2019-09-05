import static org.junit.Assert.*;

import org.junit.Test;

public class SubjectMenuTest {

	@Test
	public void testGetItems() {
		SubjectMenu menu = new SubjectMenu(); 
		assertEquals(7, menu.getItems().size());
	}
	
	@Test
	public void testGetMenuDescription() {
		SubjectMenu menu = new SubjectMenu(); 
		assertEquals("Subject", menu.getMenuDescription());
	}
	
	@Test
	public void testSetMenuDescription() {
		SubjectMenu menu = new SubjectMenu(); 
		menu.setMenuDescription("Art");
		assertEquals("Art", menu.getMenuDescription());
	}

}
