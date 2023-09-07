package com.databse;

import java.sql.*;
public class HospitalDataBase {
	    private static final String URL = "jdbc:mysql://localhost:3306/hospital";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "root";
	    static Connection connection=null;
	    
	    public static Connection getConnection() throws SQLException {
	    	if(connection==null){
	    		connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
	    	}
	        return connection; 
	    }
}
