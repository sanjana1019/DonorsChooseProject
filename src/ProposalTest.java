import static org.junit.Assert.*;

import org.junit.Test;

public class ProposalTest {

	
	@Test
	public void testGetSetPovertyType() {
		Proposal proposal = new Proposal(); 
		PovertyType pt = new PovertyType(); 
		pt.setRange("80");
		proposal.setPovertyType(pt);
		assertEquals("80", proposal.getPovertyType().getRange()); 		
	}
	
	
	@Test
	public void testGetSetSubject() {
		Proposal proposal = new Proposal(); 
		Subject subject = new Subject(); 
		subject.setName("Math");
		proposal.setSubject(subject);
		assertEquals("Math", proposal.getSubject().getName()); 		
	}
	
	
	@Test
	public void testGetSetTitle() {
		Proposal proposal = new Proposal(); 
		proposal.setTitle("Books for children");
		assertEquals("Books for children", proposal.getTitle()); 		
	}
	
	@Test
	public void testGetSetTeacherName() {
		Proposal proposal = new Proposal(); 
		proposal.setTeacherName("Mrs.Waldrof");
		assertEquals("Mrs.Waldrof", proposal.getTeacherName()); 		
	}
	
	@Test
	public void testGetSetPercentFunded() {
		Proposal proposal = new Proposal(); 
		proposal.setPercentFunded(56.00);
		assertEquals(56.00, proposal.getPercentFunded(),0.0); 		
	}

	@Test
	public void testGetSetState() {
		Proposal proposal = new Proposal(); 
		proposal.setState("NJ");
		assertEquals("NJ", proposal.getState()); 		
	}
	
	@Test
	public void testGetSetCity() {
		Proposal proposal = new Proposal(); 
		proposal.setCity("NYC");
		assertEquals("NYC", proposal.getCity()); 		
	}
	
	@Test
	public void testGetSetCostToComplete() {
		Proposal proposal = new Proposal(); 
		proposal.setCostToComplete(543.00);
		assertEquals(543.00, proposal.getCostToComplete(), 0.0); 		
	}
	
	@Test
	public void testGetSetTotalPrice() {
		Proposal proposal = new Proposal(); 
		proposal.setTotalPrice(320.00);
		assertEquals(320.00, proposal.getTotalPrice(), 0.0); 		
	}
	
	@Test
	public void testGetSetNumStudents() {
		Proposal proposal = new Proposal(); 
		proposal.setNumStudents(400);
		assertEquals(400, proposal.getNumStudents()); 		
	}
	
	@Test
	public void testToString() {
		Proposal proposal = new Proposal(); 
		proposal.setNumStudents(400);
		assertEquals("Proposal [title=null, totalPrice=0.0, percentFunded=0.0, povertyType=null, numStudents=400, subject=null, city=null, state=null, teacherName=null, costToComplete=0.0]"
, proposal.toString()); 	
	}

}
