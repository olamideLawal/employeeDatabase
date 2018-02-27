package httpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import com.google.gson.Gson;
import com.sun.net.httpserver.HttpServer;

/**
 * Description.<br>
 * 
 *   - Advance Programming Assignment. 2 HttpServer<br>
 * 
 * @author olamide lawal - 14038470
 * @version 1.0
 *
 */

public class Controller {
	
	public static void main(String[] args) throws IOException{
 
		 final EmployeeDAO empDao = new EmployeeDAO();
		 Gson gson = new Gson();
		 
		// web front end for employees application
		
		try{
		HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
		System.out.println("The server is up and running on port 8000");
				
		//Start the Http Server
		server.start();
		
		}
		catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage() + "  " + ioe.getStackTrace());
		}
	}
}
