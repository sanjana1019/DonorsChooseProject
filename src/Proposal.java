import com.fasterxml.jackson.annotation.JsonProperty;

public class Proposal {

	//name must match what's in JSON
	private String title; 
	private double totalPrice; 
	private double percentFunded; 
	private PovertyType povertyType; 
	private int numStudents;
	private Subject subject; 
	private String city; 
	private String state; 
	private String teacherName; 
	private double costToComplete; 
	//@JsonProperty("imageURL")
	//private String imageName; 
	
	/** 
	 * constructor
	 */
	public Proposal() {
	}
	
	
	/**
	 * getter
	 * @return povertyType
	 */
	public PovertyType getPovertyType() {
		return povertyType;
	}

	/**
	 * sets
	 * @param povertyType
	 */
	public void setPovertyType(PovertyType povertyType) {
		this.povertyType = povertyType;
	}

	/**
	 * getter
	 * @return subject
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * sets
	 * @param subject
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	
   /**
    * getter
    * @return title
    */
	public String getTitle() {
		return title;
	}

	/**
	 * sets
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * getter
	 * @return teacherName
	 */
	public String getTeacherName() {
		return teacherName;
	}

	/**
	 * sets
	 * @param teacherName
	 */
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	/**
	 * getter
	 * @return percentFunded
	 */
	public double getPercentFunded() {
		return percentFunded;
	}

	/**
	 * sets
	 * @param percentFunded
	 */
	public void setPercentFunded(double percentFunded) {
		this.percentFunded = percentFunded;
	}

	/**
	 * getter
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * sets
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * getter
	 * @return state
	 */
	public String getState() {
		return state;
	}

	/**
	 * sets
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * getter
	 * @return costToComplete
	 */
	public double getCostToComplete() {
		return costToComplete;
	}

	/**
	 * sets
	 * @param costToComplete
	 */
	public void setCostToComplete(double costToComplete) {
		this.costToComplete = costToComplete;
	}

	/**
	 * displays proposal details
	 */
	@Override
	public String toString() {
		return "Proposal [title=" + title + ", totalPrice=" + totalPrice + ", percentFunded=" + percentFunded
				+ ", povertyType=" + povertyType + ", numStudents=" + numStudents + ", subject=" + subject + ", city="
				+ city + ", state=" + state + ", teacherName=" + teacherName + ", costToComplete=" + costToComplete
				+ "]";
	}

	/**
	 * getter
	 * @return totalPrice
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * sets
	 * @param totalPrice
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * getter
	 * @return numStudents
	 */
	public int getNumStudents() {
		return numStudents;
	}

	/**
	 * sets
	 * @param numStudents
	 */
	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	} 
	
}
