package com.insight.variables;

import java.sql.*;

public class CommonVariables {

	public String mySQLurl = "jdbc:mysql://localhost:3306/mylearning?useSSL=false";
	public String mySQLusername ="root";
	public String mySQLpswd = "shinz9474";
	
	public Connection conn;
	public Statement stmt;
	public ResultSet rs;
	
	public int tcid;
	
	public static CommonVariables cv = new CommonVariables();
}
