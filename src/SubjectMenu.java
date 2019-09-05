import java.util.ArrayList;
import java.util.List;

public class SubjectMenu extends Menu<Integer> {

	/**
	 * used to create the subject menu
	 * using the subject search criterion
	 */
	public SubjectMenu() {
		super("Subject");
		List<SearchCriterion<Integer>> subjects = new ArrayList<>();
		SearchCriterion<Integer> musicArts = new SearchCriterion<>("Music & The Arts", "subject1", -1);
		SearchCriterion<Integer> healthSports = new SearchCriterion<>("Health & Sports", "subject2", -2);
		SearchCriterion<Integer> litLang = new SearchCriterion<>("Literacy & Language", "subject6", -6);
		SearchCriterion<Integer> histCiv = new SearchCriterion<>("History & Civics", "subject3", -3);
		SearchCriterion<Integer> mathSci = new SearchCriterion<>("Math & Science", "subject4", -4);
		SearchCriterion<Integer> specialNeeds = new SearchCriterion<>("Special Needs", "subject7", -7);
		SearchCriterion<Integer> appliedLearning = new SearchCriterion<>("Applied Learning", "subject5", -5);
		subjects.add(musicArts);
		subjects.add(healthSports);
		subjects.add(litLang);
		subjects.add(histCiv);
		subjects.add(mathSci);
		subjects.add(specialNeeds);
		subjects.add(appliedLearning);
		setItems(subjects); 
	}

} 
 