
import static org.junit.Assert.*;

import org.junit.Test;

public class SearchCriteriaTest {

	SearchCriteria sc = new SearchCriteria(); 
	
	@Test
	public void testGetSetGradeLevel() {
		SearchCriterion<Integer> gradeLevel = new SearchCriterion<Integer>("grade 5", "GradeLevel", 5); 
		sc.setGradeLevel(gradeLevel);
		assertEquals((Integer)5, sc.getGradeLevel().getValue());
		sc.toString();
		sc.toQueryString();
	}
	
	@Test
	public void testGetSetSubject() {
		SearchCriterion<Integer> subject = new SearchCriterion<Integer>("math", "Subject", 5); 
		sc.setSubject(subject);
		assertEquals((Integer)5, sc.getSubject().getValue()); 	
		sc.toString();
		sc.toQueryString();
	}
	
	@Test
	public void testGetSetResourceType() {
		SearchCriterion<Integer> rtype = new SearchCriterion<Integer>("books", "resourceType", 4); 
		sc.setResourceType(rtype);
		assertEquals((Integer)4, sc.getResourceType().getValue()); 	
		sc.toString();
		sc.toQueryString();
	}
	
	@Test
	public void testGetSetState() {
		SearchCriterion<String> state = new SearchCriterion<String>("New Jersey", "state", "NJ"); 
		sc.setState(state);
		assertEquals("NJ", sc.getState().getValue()); 
		sc.toString();
		sc.toQueryString();
	}
	
	@Test
	public void testGetSetSpecialCat() {
		SearchCriterion<String> cat = new SearchCriterion<String>("below pov", "specialCat", "90%"); 
		sc.setSpecialCat(cat);
		assertEquals("90%", sc.getSpecialCat().getValue()); 	
		sc.toString();
		sc.toQueryString();
	}
	
	@Test
	public void testGetSetKeyword() {
		SearchCriterion<String> keyword = new SearchCriterion<String>("keyword desc", "keyword", "harmonica"); 
		sc.setKeyword(keyword);
		assertEquals("harmonica", sc.getKeyword().getValue());
		sc.toString();
		sc.toQueryString();
	}
	
	@Test
	public void testGetSetOlderThan() {
		SearchCriterion<Long> olderThan = new SearchCriterion<Long>("older than", "olderThan", (long)4500000); 
		sc.setOlderThan(olderThan);
		assertNotNull(sc.getOlderThan().getValue()); 		
		//System.out.println(sc.getOlderThan().getValue());
		sc.toString();
		sc.toQueryString();
	}
	
	@Test
	public void testGetSetNewSince() {
		SearchCriterion<Long> newSince = new SearchCriterion<Long>("new since", "newSince", (long)2018); 
		sc.setNewSince(newSince);
		assertNotNull(sc.getNewSince().getValue()); 		
		//System.out.println(sc.getNewSince().getValue());
		sc.toString();
		sc.toQueryString();
	}
	


}
