import java.sql.*;
import java.util.Scanner;

public class DBApp {
	
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://db4free.net:3306/alexdemoapp";

	   //  Database credentials
	static final String USER = "alexdemo";
	static final String PASS = "passw0rd";

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		Scanner userInput = new Scanner(System.in);
		String userString = "";
		// int userInt = 0;
		double userFloat = 0.0;
		boolean answerValidation = false;
		   
		try{
			//STEP 2: Register JDBC driver
		    Class.forName("com.mysql.jdbc.Driver");

		    //STEP 3: Open a connection
		    System.out.println("Connecting to database...");
		    conn = DriverManager.getConnection(DB_URL,USER,PASS);

		    //STEP 4: Execute a query
		    System.out.println("Creating statement...");
		    stmt = conn.createStatement();
		    String sql;
		    sql = "SELECT userID, userName, balance FROM table1";
		    ResultSet rs = stmt.executeQuery(sql);

		    //STEP 5: Extract data from result set
		    while(rs.next()){
		    	//Retrieve by column name

		        String userID = rs.getString("userID");
		        String userName = rs.getString("userName");
		        float balance = rs.getFloat("balance");

		        		//Display values
		        System.out.print("ID: " + userID);
		        System.out.print(", Name: " + userName);
		        System.out.print(", Balance: " + balance + "\n");
		      }
		      //STEP 6: Clean-up environment
		      rs.close();
		      stmt.close();
		      conn.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
			// displayTable();
			
		while ((answerValidation == false))
		{
			System.out.println("Please select option:");
			displayMenu();
			userString = userInput.next();

			if ((userString.equals("A")) || (userString.equals("a")))
			{
				displayTable();
			}
			
			if ((userString.equals("B")) || (userString.equals("b")))
			{
				System.out.println("Inserting new entry.");
			}
			
			if (userString.equals("C") || userString.equals("c"))
			{
				answerValidation = true;
				System.out.println("Goodbye!");
			}
			else
			{
				System.out.println("Invalid input!");
			}


		}
			
		   	
		
	}
	
	public static void displayTable()
	{
		Connection conn = null;
		Statement stmt = null;
		
		try{
			//STEP 2: Register JDBC driver
		    Class.forName("com.mysql.jdbc.Driver");

		    //STEP 3: Open a connection
		    System.out.println("Connecting to database...");
		    conn = DriverManager.getConnection(DB_URL,USER,PASS);

		    //STEP 4: Execute a query
		    System.out.println("Creating statement...");
		    stmt = conn.createStatement();
		    String sql;
		    sql = "SELECT userID, userName, balance FROM table1";
		    ResultSet rs = stmt.executeQuery(sql);

		    //STEP 5: Extract data from result set
		    while(rs.next()){
		    	//Retrieve by column name

		        String userID = rs.getString("userID");
		        String userName = rs.getString("userName");
		        float balance = rs.getFloat("balance");

		        		//Display values
		        System.out.print("ID: " + userID);
		        System.out.print(", Name: " + userName);
		        System.out.print(", Balance: " + balance + "\n");
		      }
		      //STEP 6: Clean-up environment
		      rs.close();
		      stmt.close();
		      conn.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
	}
	
	public static void displayMenu ()
	{
		System.out.println("A - Display Table");
		System.out.println("B - Insert Entry");
		System.out.println("C - Exit");
	}
	
}
