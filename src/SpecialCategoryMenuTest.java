import static org.junit.Assert.*;

import org.junit.Test;

public class SpecialCategoryMenuTest {

	@Test
	public void testGetItems() {
		SpecialCategoryMenu menu = new SpecialCategoryMenu(); 
		assertEquals(5, menu.getItems().size());
	}
	
	@Test
	public void testGetMenuDescription() {
		SpecialCategoryMenu menu = new SpecialCategoryMenu(); 
		assertEquals("Special Category", menu.getMenuDescription());
	}
	
	@Test
	public void testSetMenuDescription() {
		SpecialCategoryMenu menu = new SpecialCategoryMenu();  
		menu.setMenuDescription("Art");
		assertEquals("Art", menu.getMenuDescription());
	}

}
