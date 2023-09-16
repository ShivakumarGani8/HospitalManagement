package com.hospital;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.databse.UserDataDAO;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Sign-in page");
		System.out.println("doPost: "+request);
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		UserDataDAO userDataDAO=new UserDataDAO();
		boolean isValidUser=false;
		try {
			isValidUser= userDataDAO.isValidUser(userName,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(isValidUser) {
			request.getRequestDispatcher("/index.html").forward(request, response);
		}
			
		System.out.println("Valid User: "+isValidUser);
	}
}
