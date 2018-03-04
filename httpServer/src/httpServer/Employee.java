package httpServer;

/**
 * Description.<br>
 * 
 *   - Advance Programming Assignment. 2 HttpServer<br>
 * 
 * @author olamide lawal - 14038470
 * @version 1.0
 *   
 */

public class Employee extends Person{
	
	/**
	 * Base Class - Employee extends Person
	 */
	

	private String nin;
	private String Salary;
	private String startDate;
	private String jobTitle;
	private String email;
	
	/**
	 * 
	 * @param newFName
	 * @param newLName
	 * @param newGender
	 * @param newNatInsNo
	 * @param newDob
	 * @param newAddress
	 * @param newPostcode
	 * @param newId
	 * @param newSalary
	 * @param newStartDate
	 * @param newJobTitle
	 * @param newEmail
	 */

	public Employee(String newFName, String newLName, String newGender, String newNatInsNo, String newDob,
			String newAddress, String newPostcode, String newSalary, String newStartDate, String newJobTitle, String newEmail) {
		
		super(newFName, newLName, newGender, newDob, newAddress, newPostcode);
		
		nin = newNatInsNo;
		Salary = newSalary;
		startDate = newStartDate;
		jobTitle = newJobTitle;
		email = newEmail;
		
	}


	public Employee() {
		
	}
	
	/**
	 * @return the nin
	 */
	public String getNin(){
		return nin;
	}
	
	/**
	 * @param newNatInsNo set NIN
	 */
	public void setNin(String newNatInsNo){
		this.nin = newNatInsNo;
	}


	/**
	 * @return the salary
	 */
	public String getSalary() {
		return Salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String newSalary) {
		Salary = newSalary;
	}


	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}


	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String newStartDate) {
		this.startDate = newStartDate;
	}


	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}


	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String newJobTitle) {
		this.jobTitle = newJobTitle;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

}

