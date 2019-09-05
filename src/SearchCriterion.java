
public class SearchCriterion<T> {

	private String description; 
	private String key; 
	private T value; 
	
	/**
	 * constructor 
	 * @param description of the criterion
	 * @param key of the criterion
	 * @param value of the criterion
	 * key/value are used to interact with the donorsChoose API
	 */
	public SearchCriterion(String description, String key, T value){
		this.description = description; 
		this.key = key; 
		this.value = value;  
	}

	/**
	 * getter
	 * @return the description of criterion
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * sets the description of criterion
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * getter
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * sets the key 
	 * @param key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * getter 
	 * @return the value of criterion
	 */
	public T getValue() {
		return value;
	}

	/**
	 * sets the value 
	 * @param value
	 */
	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * toString to display key and value 
	 */
	@Override
	public String toString() {
		return key + "=" + value;
	}
	
	
	
	
}
