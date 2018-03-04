package httpServer;

/**
 * Description.<br>
 * 
 *   - Advance Programming Database. HttpServer<br>
 * 
 * @author olamide lawal 
 * @version 1.0
 *
 */

public class Person {
	
	/**
	 * Base Class - Person
	 */
	
	private String FirstName;
	private String LastName;
	private String Gender;
	private String dob;
	private String Address;
	private String Postcode;
	

	
	/**
	 * 
	 * @param newFName
	 * @param newLName
	 * @param newGender
	 * @param newDob
	 * @param newAddress
	 * @param newPostcode
	 * 
	 */
	
	public Person(String newFName, String newLName, String newGender, 
			String newDob, String newAddress, String newPostcode){
		
		FirstName = newFName;
		LastName = newLName;
		Gender = newGender;
		dob = newDob;
		Address = newAddress;
		Postcode = newPostcode;
		
	}
	public Person(){
		
	}
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String newFName) {
		FirstName = newFName;
	}
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String newLName) {
		LastName = newLName;
	}
	
	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}
	
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String newGender) {
		Gender = newGender;
	}
	
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	
	/**
	 * @param dob the dob to set
	 */
	
	public void setDob(String newDob) {
		this.dob = newDob;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String newAddress) {
		Address = newAddress;
	}
	
	/**
	 * @return the postcode
	 */
	public String getPostcode() {
		return Postcode;
	}
	
	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(String newPostcode) {
		Postcode = newPostcode;
	}
}

