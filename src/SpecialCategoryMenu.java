import java.util.ArrayList;
import java.util.List;

public class SpecialCategoryMenu extends Menu<String> {

	/**
	 * used to create the special category menu
	 * using the special category search criterion
	 * which is put into an ArrayList
	 */
	public SpecialCategoryMenu() {
		super("Special Category"); 
		List<SearchCriterion<String>> specCategories = new ArrayList<>();
		SearchCriterion<String> partiallyFunded = new SearchCriterion<>("Projects that have partial donation", "partiallyFunded", "yes");
		SearchCriterion<String> notPartiallyFunded = new SearchCriterion<>("Projects that have no donation yet", "partiallyFunded", "no");
		SearchCriterion<String> highPoverty = new SearchCriterion<>("Projects from high poverty schools (>40% students receive free lunch)", "highLevelPoverty", "true");
		SearchCriterion<String> highestPoverty = new SearchCriterion<>("Projects from highest poverty schools (>65% students receive free lunch)", "highestLevelPoverty", "true");
		SearchCriterion<String> teacherNotFunded = new SearchCriterion<>("Projects from never before funded teachers", "teacherNotFunded", "true");
		specCategories.add(partiallyFunded);
		specCategories.add(notPartiallyFunded);
		specCategories.add(highPoverty);
		specCategories.add(highestPoverty);
		specCategories.add(teacherNotFunded);
		setItems(specCategories); 
	}

} 
