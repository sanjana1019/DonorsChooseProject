import static org.junit.Assert.*;

import org.junit.Test;

public class GradeLevelMenuTest {

	@Test
	public void testGetItems() {
		GradeLevelMenu menu = new GradeLevelMenu(); 
		assertEquals(5, menu.getItems().size());
	}
	
	@Test
	public void testGetDescription() {
		GradeLevelMenu menu = new GradeLevelMenu();  
		assertEquals("Grade Level", menu.getMenuDescription());
	}
	
	@Test
	public void testSetDescription() {
		GradeLevelMenu menu = new GradeLevelMenu();  
		menu.setMenuDescription("School type");
		assertEquals("School type", menu.getMenuDescription());
	}

}
