package com.insight.dbconnector;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.insight.variables.CommonVariables;
import java.sql.*;

public class DBConnector {

	CommonVariables cv = new CommonVariables();
	
	public void openDBConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cv.conn = DriverManager.getConnection(cv.mySQLurl, cv.mySQLusername, cv.mySQLpswd);		
			
		}
		catch(Exception ex)
		{
			System.out.println("Exception Processing message shud be displayed here in JSON/XML format in openDBConnection()");
		}
	}
	
	public ResultSet executeQuery(String query)
	{
		try
		{
			cv.stmt = cv.conn.createStatement();			
			cv.rs=cv.stmt.executeQuery(query);
			return cv.rs;
		}		
		catch (Exception e) 
		{
			System.out.println("Exception Processing message shud be displayed here in JSON/XML format in executeQuery()");
			return cv.rs;
		}
	}
	
	public int executeUpdateQuery(String query)
	{
		int count = 0;
		try
		{
			cv.stmt = cv.conn.createStatement();			
			count=cv.stmt.executeUpdate(query);
			return count;
		}		
		catch (Exception e) 
		{
			System.out.println("Exception Processing message shud be displayed here in JSON/XML format in executeQuery()");
			return count;
		}
	}
	
	public void closeAllConnection()
	{
		try 
		{
			if(!cv.conn.isClosed())
			{
				cv.conn.close();
			}
			
			if(cv.conn!=null)
			{
				cv.conn.close();
			}
			
			if(cv.stmt!=null)
			{
				cv.stmt.close();
			}
			
			if(cv.rs!=null)
			{
				cv.rs.close();
			}
		}
		catch (SQLException sex) 
		{
			System.out.println("Exception occured when closing connection. \n\n"+sex.getMessage());
		}
	}
}
