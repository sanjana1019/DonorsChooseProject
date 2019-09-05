import java.util.ArrayList;
import java.util.List;

public class ResourceTypeMenu extends Menu<Integer> {

	/**
	 * used to create the resource type menu
	 * using the resource type search criterion
	 * and putting them into an ArrayList 
	 */
	public ResourceTypeMenu() {
		super("Resource Type");
		List<SearchCriterion<Integer>> resourceTypes = new ArrayList<>(); 
		SearchCriterion<Integer> books = new SearchCriterion<>("Books", "proposalType", 1);
		SearchCriterion<Integer> technology = new SearchCriterion<>("Technology", "proposalType", 2);
		SearchCriterion<Integer> supplies = new SearchCriterion<>("Supplies", "proposalType", 3);
		SearchCriterion<Integer> trips = new SearchCriterion<>("Trips", "proposalType", 4);
		SearchCriterion<Integer> visitors = new SearchCriterion<>("Visitors", "proposalType", 5);
		SearchCriterion<Integer> other = new SearchCriterion<>("Other", "proposalType", 6);
		resourceTypes.add(books);
		resourceTypes.add(technology);
		resourceTypes.add(supplies);
		resourceTypes.add(trips);
		resourceTypes.add(visitors);
		resourceTypes.add(other);
		setItems(resourceTypes); 
	}

} 
