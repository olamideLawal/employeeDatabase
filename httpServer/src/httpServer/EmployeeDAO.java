package httpServer;

import java.sql.*;
import java.util.ArrayList;


/**
 * Description.<br>
 * 
 *   - Advance Programming Assignment. 2 HttpServer<br>
 * 
 * @author olamide lawal - 14038470
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
}
