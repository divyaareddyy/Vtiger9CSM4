package datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDataBase {

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
		ResultSet result =statement.executeQuery("select * from employees;");
		
		while (result.next()) {
        System.out.println(result.getInt("id")+"\t"+result.getString("name")+"\t"+result.getInt("salary")+"\t"+result.getString("phone"));
        
	}
		//step 6: Close database connection
		connection.close();

}
}
