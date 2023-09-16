package com.databse;

import java.sql.*;

public class HospitalDataBase {
	    private static final String url = "jdbc:mysql://localhost:3306/hospital";
	    private static final String userName= "root";
	    private static final String password = "root";
	    static Connection connection=null;
	    
		
		// Sets database connection
		private void setDBConnection() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, userName, password);
				System.out.println("Database connection successfull !");
			} catch (Exception e) {
				e.printStackTrace();
//				System.out.println("Database connection failed !");
			}
			
		}

		// To get the database connection in other  classes
		public static Connection getDBConnection() {
			if (connection != null) {
				System.out.println("DB connection object: "+connection);
				return connection;
			} else {
				new HospitalDataBase().setDBConnection();
				return connection;
			}
		}
}
