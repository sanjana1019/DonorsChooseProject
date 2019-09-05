import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * allows the user to make a selection by
 * providing the menus and options to the user
 * returns the matching donorsChoose proposals
 * @author sanjana prakash
 *
 */
public class Main {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Hi there! Let's get started on finding you "
				+ "\nthe right public school project to donate to! "
				+ "\nAs someone once said:"
				+ "\nGiving is not just about making a donation. "
				+ "\nIt is about making a difference!");
		System.out.println("---------------------------------------\n");
	
		SearchCriteria criteria = new SearchCriteria(); 
		int choice = 0;
		Menu<Integer> subjectMenu = new SubjectMenu();
		Menu<Integer> gradeLevelMenu = new GradeLevelMenu();
		Menu<Integer> resourceTypeMenu = new ResourceTypeMenu();
		Menu<String> specCategoryMenu = new SpecialCategoryMenu();
		
		do {
			try {
				choice = offerMainMenu();
				switch (choice) {
				case 1: //make a selection option 
					int menuChoice = offerCriterionMenu(); 
					if (menuChoice == 1) {
						//calls method in superclass 
						//gets the subject menu and sets criteria 
						SearchCriterion<Integer> selectedSubject = subjectMenu.offerMenu(in);
						if (selectedSubject != null) {
							criteria.setSubject(selectedSubject);
						}
					} else if (menuChoice == 2) {
						//gets the grade level menu and sets criteria 
						SearchCriterion<Integer> selectedGrade = gradeLevelMenu.offerMenu(in);
						if (selectedGrade != null) {
							criteria.setGradeLevel(selectedGrade);
						}
					} else if (menuChoice == 3) {
						//gets the resource type menu and sets criteria 
						SearchCriterion<Integer> selectedResource = resourceTypeMenu.offerMenu(in);
						if (selectedResource != null) {
							criteria.setResourceType(selectedResource);
						}
					} else if (menuChoice == 4) {
						//gets the state code and sets it in the criteria
						System.out.println("Please enter a state code: ");
						String stateCode = in.nextLine(); 
						if (stateCode != null && !stateCode.trim().equals("")) {
							criteria.setState(new SearchCriterion<String>(stateCode, "state", stateCode));
						}
					} else if (menuChoice == 5) {
						//gets the special category menu and sets it in the criteria
						SearchCriterion<String> selectedSpecCat = specCategoryMenu.offerMenu(in);
						if (selectedSpecCat != null) {
							criteria.setSpecialCat(selectedSpecCat);
						}
					} else if (menuChoice == 6) {
						//gets the keyword input by user and sets it in the criteria
						System.out.println("Please enter a keyword: ");
						String keyword = in.nextLine(); 
						//if keyword is not null and not empty string 
						if (keyword != null && !keyword.trim().equals("")) {
							//can add multiple words in keyword
							criteria.setKeyword(new SearchCriterion<String>(keyword, "keywords", keyword.replaceAll(" ", "+")));
						}
					} else if (menuChoice == 8) {
						//clear search criteria 
						System.out.println("search criteria cleared");
						criteria = new SearchCriteria();
					}
					//shows the user what criteria they're currently searching by 
					System.out.println("Your current search criteria: " + criteria.toString());
					System.out.println();

					break;
				case 2: //run live search option
					//get proposals corresponding to search criteria 
					criteria.setOlderThan(null); //takes care of expired/funded proposals 
					criteria.setNewSince(null);
					List<Proposal> proposals = getProposals(criteria, false).getProposals();
					for (Proposal p : proposals) {
						System.out.println(p);
					}
					break;
				case 3: //get historical data option
					System.out.println("Please enter a year (after 2001): ");
					int year = in.nextInt(); 
					in.nextLine(); 
					//if year is within this range 
					if (year > 2001 && year <= 2019) {
						//from Jan 1st to Dec 31st
						Long from = new GregorianCalendar(year,1,1).getTimeInMillis(); 
						Long to = new GregorianCalendar(year,12,31).getTimeInMillis(); 
						criteria.setOlderThan(new SearchCriterion<Long>("Dec 31st " + year, "olderThan", to));
						criteria.setNewSince(new SearchCriterion<Long>("Jan 1st " + year, "newSince", from));
					}
					int numProposals = getProposals(criteria, true).getTotalProposals();
					System.out.println("In " + year + " in addition to the other search criteria, there were " + numProposals + " proposals funded");
					break;
				case 4: //exit program option 
					System.out.println("Exiting program. Goodbye!");
					return;
				default:
					System.out.println("Invalid selection try again");
				}
			//catch the exceptions
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
			}
		} while (choice != 4);
	}




	/**
	 * gets a list of proposals from donorsChoose using the search criteria
	 * @param crit is the SearchCriteria
	 * @return list of proposals
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static ProjectData getProposals(SearchCriteria crit,  boolean historic)
			throws JsonParseException, JsonMappingException, IOException {
		String uri = String.format("https://api.donorschoose.org/common/json_feed.html?&APIKey=DONORSCHOOSE");
		uri = uri + "&" + crit.toQueryString();
		if (historic){
			uri = uri + "&" + "historical=true"; 
		}
		URL url = new URL(uri);
		// takes JSON and makes java objects
		ObjectMapper mapper = new ObjectMapper();
		// will work even if fields in the response are not represented in proposal class
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		// creates an instance of ProjectData class using url
		ProjectData data = mapper.readValue(url, ProjectData.class); 
		//turns instance back to JSON
		String json = mapper.writeValueAsString(data);
		//turns JSON back into an instance 
		data = mapper.readValue(json, ProjectData.class); 
		return data;
	}
	
	
	
	/**
	 * offers the (first) main menu 
	 * @return the number (choice) that was chosen 
	 */
	public static int offerMainMenu() {
		System.out.println("Please select: ");
		System.out.println("1. Make a selection");
		System.out.println("2. Run live project search ");
		System.out.println("3. Run a histrical project search ");
		System.out.println("4. Exit program ");
		int choice = in.nextInt();
		in.nextLine();
		return choice;
	}

	/**
	 * offers the (2nd) criterion menu 
	 * @return the number (choice) that was chosen
	 */
	public static int offerCriterionMenu() {
		System.out.println("Choose the search criteria: ");
		System.out.println("1. Subject Area");
		System.out.println("2. Grade Level");
		System.out.println("3. Resource Type");
		System.out.println("4. State");
		System.out.println("5. Special Categories");
		System.out.println("6. Keyword");
		System.out.println("7. Show current search criteria");
		System.out.println("8. Clear current search criteria");
		int choice = in.nextInt();
		in.nextLine();
		return choice;
	}


}
