import static org.junit.Assert.*;

import org.junit.Test;

public class ResourceTypeMenuTest {

	@Test
	public void testGetItems() {
		ResourceTypeMenu menu = new ResourceTypeMenu(); 
		assertEquals(6, menu.getItems().size());
	}
	
	@Test
	public void testGetDescription() {
		ResourceTypeMenu menu = new ResourceTypeMenu(); 
		assertEquals("Resource Type", menu.getMenuDescription());
	}
	
	@Test
	public void testSetDescription() {
		ResourceTypeMenu menu = new ResourceTypeMenu(); 
		menu.setMenuDescription("Art");
		assertEquals("Art", menu.getMenuDescription());
	}
}
