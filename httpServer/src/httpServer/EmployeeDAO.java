package httpServer;

import java.sql.*;
import java.util.ArrayList;


/**
 * Description.<br>
 * 
 *   - Advance Programming Database. HttpServer<br>
 * 
 * @author olamide lawal 
 * @version 1.0
 *
 */


public class EmployeeDAO {
	
	/**
	 * Description.<br>
	 * 
	 * Employee Database Access Object<br>
	 * 
	 * It Creates the Connection with the SQLite Database.<br>
	 * 
	 * All the Database Related Functions are in this class.<br>
	 * 
	 */
	
	private static Connection conn;
	private static boolean hasData = false;
	
	private static Statement stmt;
	ResultSet res;
	
	
	/**
	 * getConnection() method establishes a connection with SQLite Database.
	 * 
	 * @throws SQLException
	 */
	
	private void getConnection() throws SQLException{
		
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:Sqlite:empdb.sqlite");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		initialize();
	}
	
	/**
	 * Initialize method
	 * 
	 * @throws SQLException
	 */
	
	private void initialize() throws SQLException {
		if(!hasData){
			hasData = true;
			
			stmt = conn.createStatement();
			res = stmt.executeQuery("SELECT * FROM Employees");

		if(!res.next()){
		System.out.println("Employees table doesnt exist - not implemented");
		}	
		}
	}
	
	/**
	 * closeConnection method - closes resultset, conn, and statement.
	 * 
	 * @throws SQLException
	 */
	
	public void closeConnection() throws SQLException{
		if(res != null){
			res.close();
		}
		if(conn != null){
			conn.close();
		}
		if(stmt != null){
			stmt.close();
		}
		
	}

/**
 * displayEmployees() gets the data from Employees table and makes an ArrayList of Employee object.
 *  
 * @return ArrayList of Employee Object.
 * @throws SQLException
 */

public ArrayList<Employee> displayEmployees() throws SQLException{
	
	ArrayList<Employee> empList = new ArrayList<>();
	
	if(conn == null){
		getConnection();
	}
	
	try{
	stmt = conn.createStatement();
	res = stmt.executeQuery("SELECT * FROM Employees");
	
	
	while(res.next()){
		Employee employee = new Employee(res.getString("FirstName"),
				res.getString("LastName"),res.getString("Gender"), res.getString("NIN"), 
				res.getString("DOB"), res.getString("Address"), res.getString("Postcode"),
				res.getString("Salary"),res.getString("StartDate"),res.getString("JobTitle"), 
				res.getString("Email"));
		empList.add(employee);
	}
	
	return empList;
	
	}catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }
	
		return empList;
	}

/**
 * insertEmp method takes an instance of Employee and creates a new record in the database.
 * 
 * @param emp
 * @throws SQLException
 */

public void insertEmp(Employee emp) throws SQLException {
	if(conn == null){
		getConnection();
	}
	try {
		
		String sql = "INSERT INTO Employees (FirstName, LastName, Gender, NIN, DOB, Address, Postcode, Salary, StartDate, JobTitle, Email) " +
		"VALUES ( \"" +emp.getFirstName()+"\",\""+emp.getLastName()+"\", \""+emp.getGender()+"\", \""+emp.getNin()+"\", \""+
				emp.getDob()+"\", \""+emp.getAddress()+"\", \""+emp.getPostcode()+"\", \""+emp.getSalary()+"\", \""+emp.getStartDate()+"\", \""+
				emp.getJobTitle()+"\", \""+emp.getEmail()+"\");";

	
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("Employee Records Successfully Created!\n");	
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}
}

