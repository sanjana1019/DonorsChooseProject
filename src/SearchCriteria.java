
public class SearchCriteria {
	
	//these are the criteria the user can search by
	private SearchCriterion<Integer> subject;
	private SearchCriterion<Integer> gradeLevel;
	private SearchCriterion<Integer> resourceType;
	private SearchCriterion<String> specialCat;
	private SearchCriterion<String> state;
	private SearchCriterion<String> keyword;
	private SearchCriterion<Long> olderThan;
	private SearchCriterion<Long> newSince;
	

	/**
	 * get olderThan
	 * @return olderThan
	 */
	public SearchCriterion<Long> getOlderThan() {
		return olderThan;
	}

	/**
	 * set olderThan
	 * @param olderThan
	 */
	public void setOlderThan(SearchCriterion<Long> olderThan) {
		this.olderThan = olderThan;
	}

	/**
	 * get NewSince
	 * @return NewSince
	 */
	public SearchCriterion<Long> getNewSince() {
		return newSince;
	}

	/**
	 * set newSince
	 * @param newSince
	 */
	public void setNewSince(SearchCriterion<Long> newSince) {
		this.newSince = newSince; 
	}

	/**
	 * gets keyword
	 * @return keyword
	 */
	public SearchCriterion<String> getKeyword() {
		return keyword;
	}

	/**
	 * sets keyword
	 * @param keyword
	 */
	public void setKeyword(SearchCriterion<String> keyword) {
		this.keyword = keyword;
	}

	/**
	 * gets the state
	 * @return state
	 */
	public SearchCriterion<String> getState() {
		return state;
	}

	/**
	 * sets state
	 * @param state
	 */
	public void setState(SearchCriterion<String> state) {
		this.state = state;
	}

	/**
	 * gets the resource type
	 * @return resourceType
	 */
	public SearchCriterion<Integer> getResourceType() {
		return resourceType;
	}

	/**
	 * sets the resource type
	 * @param resourceType
	 */
	public void setResourceType(SearchCriterion<Integer> resourceType) {
		this.resourceType = resourceType;
	}

	/**
	 * gets the special category
	 * @return special category
	 */
	public SearchCriterion<String> getSpecialCat() {
		return specialCat;
	}

	/**
	 * sets special category 
	 * @param specialCat
	 */
	public void setSpecialCat(SearchCriterion<String> specialCat) {
		this.specialCat = specialCat;
	}

	/**
	 * gets the subject
	 * @return subject
	 */
	public SearchCriterion<Integer> getSubject() {
		return subject;
	}

	/**
	 * gets grade level
	 * @return gradeLevel
	 */
	public SearchCriterion<Integer> getGradeLevel() {
		return gradeLevel;
	}

	/**
	 * sets grade level 
	 * @param gradeLevel
	 */
	public void setGradeLevel(SearchCriterion<Integer> gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	/**
	 * sets the subject 
	 * @param subject
	 */
	public void setSubject(SearchCriterion<Integer> subject) {
		this.subject = subject;
	} 

	/**
	 * toString method for the criteria that are searched 
	 * lets the user know which criteria they have chosen
	 * by providing a criterion description 
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder(); 
		if (subject != null){
			sb.append(System.lineSeparator());
			sb.append("searching by subject: "); 
			sb.append(subject.getDescription()); 
		}		
		if (gradeLevel != null){
			sb.append(System.lineSeparator()); 
			sb.append("searching by grade level: "); 
			sb.append(gradeLevel.getDescription()); 
		}
		if (resourceType != null){
			sb.append(System.lineSeparator()); 
			sb.append("searching by resource type: "); 
			sb.append(resourceType.getDescription()); 
		}
		if (specialCat != null){
			sb.append(System.lineSeparator()); 
			sb.append("searching by special category: "); 
			sb.append(specialCat.getDescription()); 
		}
		if (state != null){
			sb.append(System.lineSeparator()); 
			sb.append("searching by state: "); 
			sb.append(state.getDescription()); 
		}
		if (keyword != null){
			sb.append(System.lineSeparator()); 
			sb.append("searching by keyword: "); 
			sb.append(keyword.getDescription()); 
		}
		if (newSince != null){
			sb.append(System.lineSeparator()); 
			sb.append("searching after date: "); 
			sb.append(newSince.getDescription()); 
		}
		if (olderThan != null){
			sb.append(System.lineSeparator()); 
			sb.append("searching before date: "); 
			sb.append(olderThan.getDescription()); 
		}		
		return sb.toString(); 
	}
	
	/**
	 * creates the query string which will be 
	 * appended to the donorsChoose url 
	 * @return the query string  
	 */
	public String toQueryString(){
		StringBuilder sb = new StringBuilder(); 
		if(subject != null){
			sb.append(subject); 
		}
		if(gradeLevel != null){
			sb.append("&"); 
			sb.append(gradeLevel); 
		}
		if(resourceType != null){
			sb.append("&"); 
			sb.append(resourceType); 
		}
		if(specialCat != null){
			sb.append("&"); 
			sb.append(specialCat); 
		}
		if(state != null){
			sb.append("&"); 
			sb.append(state); 
		}
		if(keyword != null){
			sb.append("&"); 
			sb.append(keyword); 
		}
		if(olderThan != null){
			sb.append("&"); 
			sb.append(olderThan); 
		}
		if(newSince != null){
			sb.append("&"); 
			sb.append(newSince); 
		}
		return sb.toString(); 
	}
	
	
	
	
	

}
