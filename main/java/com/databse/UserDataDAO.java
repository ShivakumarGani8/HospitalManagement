package com.databse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hospital.UserData;
public class UserDataDAO {
	
	private static final String insertUser = "INSERT INTO users (email,username,password) VALUES (?, ?, ?)";
	private static final String getUser = "select password from users where username=?";
	public boolean createUser(UserData userData) throws SQLException {
		Connection connection= HospitalDataBase.getDBConnection();
		PreparedStatement prepare=connection.prepareStatement(insertUser);
		prepare.setString(1, userData.getEmail());
		prepare.setString(2,userData.getUsername());
		prepare.setString(3, userData.getPassword());
		if(prepare.executeUpdate()>0) {
			return true;
		}
		return false;
	}

	public boolean isValidUser(String userName,String password) throws SQLException {
		Connection connection= HospitalDataBase.getDBConnection();
		PreparedStatement prepare=connection.prepareStatement(getUser);
		prepare.setString(1,userName);
		ResultSet set= prepare.executeQuery();
		while(set.next()) {
			String orgPassword=set.getString("password");
			if(password.equals(orgPassword))
				return true;
		}
			
		return false;
	}
}
