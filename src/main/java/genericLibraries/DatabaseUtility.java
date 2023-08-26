package genericLibraries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;
 /**
  * This class contains reusable methods to perform operations on database
  * @author DELL
  */

public class DatabaseUtility
{
	private Connection connection;
	private Statement statement;
	/**
	 * This method is used to connect to database
	 * @param url
	 * @param user
	 * @param pwd
	 */
 public void databaseIntialization(String url,String user,String pwd)  
 {
	 Driver dbDriver=null;
	 try 
	 {
		 dbDriver=new Driver(); 
	 }
	 catch (SQLException e)
	 {
		 e.printStackTrace();
	 }
	 try
	 {
	 Connection connection =DriverManager.getConnection(url, user, pwd);
	 }
	 catch (SQLException e)
	 {
		 e.printStackTrace();
	 }
	 try
	 {
	 Statement statement= connection.createStatement();
	 }
	 catch (SQLException e)
	 {
		 e.printStackTrace();
	 }
 }
 /**
  * This method is used to read data from database
  * @param query
  * @param columnName
  * @return
  * @throws SQLException
  */
     public List<String> readFromDatabase(String query,String columnName)throws SQLException
     {
	 ResultSet result= statement.executeQuery(query);
	 
	 List<String>list=new ArrayList<String>();
	 while (result.next()) 
	 {
		list.add(result.getString(columnName)); 
	 }
	 return list;
 }
  public  int modifyDatabase(String query) 
  {
	  int result =0;
	  try
	  {
		 result = statement.executeUpdate(query);
	  }
	  catch(SQLException e)
	  {
		e.printStackTrace();  
	  }
	  return result;
  }
  /**
   * This method is used to close database connection
   */
  public void closeDatabase()
  {
	try 
	{
		connection.close();
	} 
	catch (SQLException e)
	{
		e.printStackTrace();
	}  
  }
}
