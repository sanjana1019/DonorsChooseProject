import java.util.ArrayList;
import java.util.List;

public class GradeLevelMenu extends Menu<Integer> {

	public GradeLevelMenu() {
		super("Grade Level"); //menu description
		List<SearchCriterion<Integer>> gradeLevels = new ArrayList<>();
		SearchCriterion<Integer> preK = new SearchCriterion<>("Grades PreK-2", "gradeType", 1);
		SearchCriterion<Integer> grade3to5 = new SearchCriterion<>("Grades 3-5", "gradeType", 2);
		SearchCriterion<Integer> grade6to8 = new SearchCriterion<>("Grades 6-8", "gradeType", 3);
		SearchCriterion<Integer> highSchool = new SearchCriterion<>("High School", "gradeType", 4);
		SearchCriterion<Integer> adultEd = new SearchCriterion<>("Adult Ed", "gradeType", 5);
		gradeLevels.add(preK);
		gradeLevels.add(grade3to5);
		gradeLevels.add(grade6to8);
		gradeLevels.add(highSchool);
		gradeLevels.add(adultEd);
		setItems(gradeLevels); 
	}

} 
