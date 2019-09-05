import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ProjectDataTest {

	@Test
	public void testGetSetProposals() {
		ProjectData data = new ProjectData();  
		//create proposal
		Proposal prop1 = new Proposal(); 
		prop1.setState("NJ");
		//create arraylist of proposal
		List<Proposal> propList  = new ArrayList<>();
		propList.add(prop1); 
		data.setProposals(propList);
		assertEquals("[Proposal [title=null, totalPrice=0.0, percentFunded=0.0, povertyType=null, "
				+ "numStudents=0, subject=null, city=null, state=NJ, teacherName=null, "
				+ "costToComplete=0.0]]", data.getProposals().toString());
	}
	
	@Test
	public void testGetTotalProposals() {
		ProjectData data = new ProjectData();  	
		data.setTotalProposals(234);
		assertEquals(234, data.getTotalProposals()); 
	}
	
	@Test
	public void testToString() {
		ProjectData data = new ProjectData();  
		//create proposal
		Proposal prop1 = new Proposal(); 
		prop1.setState("NJ");
		//create arraylist of proposal
		List<Proposal> propList  = new ArrayList<>();
		propList.add(prop1); 
		data.setProposals(propList);
		assertEquals("ProjectData [totalProposals=0, proposals=[Proposal [title=null, totalPrice=0.0, "
				+ "percentFunded=0.0, povertyType=null, numStudents=0, subject=null, city=null, "
				+ "state=NJ, teacherName=null, costToComplete=0.0]]]", data.toString());
	}
	

}
