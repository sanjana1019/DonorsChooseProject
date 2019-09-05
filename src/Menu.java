import java.util.List;
import java.util.Scanner;

public class Menu<T> {
	
	private List<SearchCriterion<T>> items;
	private String menuDescription; 
	
	/**
	 * Menu constructor
	 * @param menuDescription description of menu
	 */
	public Menu(String menuDescription) {
		this.menuDescription = menuDescription;
	} 
	

	/**
	 * getter
	 * @return items - the list of search criterion
	 */
	public List<SearchCriterion<T>> getItems() {
		return items; 
	}

	/**
	 * setter
	 * @param items the list of search criterion
	 */
	public void setItems(List<SearchCriterion<T>> items) {
		this.items = items;
	}

	/**
	 * getter 
	 * @return the menu description 
	 */
	public String getMenuDescription() {
		return menuDescription;
	}

	/**
	 * sets the menu description 
	 * @param menuDescription the type of menu 
	 */
	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	} 
 
	/**
	 * shows the menu selection and returns the option user chooses
	 * @param in is input from Scanner 
	 * @return the number of the item that was chosen
	 */
	public SearchCriterion<T> offerMenu(Scanner in) {
		int count = 1;
		//print the list of all menu items for that search criterion
		System.out.println(menuDescription + " menu: ");
		for (SearchCriterion<T> item : items) {
			System.out.println(count + ". " + item.getDescription());
			count++;
		}
		//prompt the user to choose 
		System.out.println("Please choose a " + menuDescription + " or 0 to cancel: ");
		int index = in.nextInt(); 
		// process enter key
		in.nextLine();
		//return the item they chose 
		if (index > 0 && index - 1 < items.size()) {
			return items.get(index - 1);
		}
		return null;
	}
	

}
