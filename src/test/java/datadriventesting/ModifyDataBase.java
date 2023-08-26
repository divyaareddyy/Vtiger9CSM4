package datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ModifyDataBase {

	public static void main(String[] args) throws SQLException 
	{
		//step 1: create an instance of JDBC Driver
	    Driver dbDriver = new Driver();
	    //step 2: Register Driver
	    DriverManager.registerDriver(dbDriver);
	    //step 3:Establish database connection
	    Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root","root");
	    //step 4: Create statement
	    Statement statement = connection.createStatement();
		//step 5:Execute query to fetch data
	    int result = statement.executeUpdate("insert into employees(id,name,salary,phone) values(105,'ravali',35000,'8948101415');");
	  	if (result == 1)
	  		System.out.println("DataBase updated successfully");
	  	else
	  		System.out.println("DataBase modification failed");
	  	//step 6:Close database connection
	  	connection.close();

	}

}
