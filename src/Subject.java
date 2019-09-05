
public class Subject {

	private String name;

	/**
	 *getter
	 * @return the name of the subject
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the subject name 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * toString to display the subject name 
	 */
	@Override
	public String toString() {
		return "Subject [name=" + name + "]";
	} 
	
}
