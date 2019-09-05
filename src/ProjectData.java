import java.util.ArrayList;
import java.util.List;

public class ProjectData {

	private int totalProposals; 
	//collection of proposals
	private List<Proposal> proposals;
	
	/**
	 * constructor 
	 * creates an ArrayList of proposals
	 */
	public ProjectData() {
		proposals = new ArrayList<>(); 
	}

	/**
	 * getter
	 * @return totalProposals
	 */
	public int getTotalProposals() {
		return totalProposals;
	}

	/**
	 * sets
	 * @param totalProposals
	 */
	public void setTotalProposals(int totalProposals) {
		this.totalProposals = totalProposals;
	}

	/**
	 * getter
	 * @return proposals
	 */
	public List<Proposal> getProposals() {
		return proposals;
	}

	/**
	 * sets
	 * @param proposals
	 */
	public void setProposals(List<Proposal> proposals) {
		this.proposals = proposals;
	}

	/**
	 * displays total number of proposals
	 */
	@Override
	public String toString() {
		return "ProjectData [totalProposals=" + totalProposals + ", proposals=" + proposals + "]";
	}
	
	
	
	
}
