import static org.junit.Assert.*;

import org.junit.Test;

public class SearchCriterionTest {

	@Test
	public void testSetGetDescription() {
		SearchCriterion<Integer> sc = new SearchCriterion<>("Art", "Subject", 10); 
		sc.setDescription("Gym");
		assertEquals("Gym", sc.getDescription());
	}
	 
	@Test 
	public void testSetGetKey() {
		SearchCriterion<Integer> sc = new SearchCriterion<>("Art", "Subject", 10); 
		sc.setKey("Resource");
		assertEquals("Resource", sc.getKey());
	}
	
	@Test
	public void testSetGetValue() {
		SearchCriterion sc = new SearchCriterion<>("Art", "Subject", 10);  
		sc.setValue(20);
		assertEquals(20, sc.getValue());
	}
	
	@Test
	public void testToString() {
		SearchCriterion<Integer> sc = new SearchCriterion<>("Art", "Subject", 10);  
		sc.setValue(20);
		assertEquals("Subject=20", sc.toString());
	}

}
