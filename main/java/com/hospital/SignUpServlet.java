package com.hospital;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.databse.UserDataDAO;

@WebServlet("/SignUp")
public class SignUpServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Sign-Up page");
		System.out.println("Request : "+req);
		super.doPost(req, resp);
		String email=req.getParameter("email");
		String userName=req.getParameter("username");
		String password=req.getParameter("password");
		
		UserData userData=new UserData(email,userName,password);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.doGet(request, response);
		System.out.println("Sign-Up page");
		System.out.println("doGet : "+request);
		String email=request.getParameter("email");
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		
		UserData userData=new UserData(email,userName,password);
		UserDataDAO userDataDAO=new UserDataDAO();
		boolean userCreated=false;
		try {
			userCreated=userDataDAO.createUser(userData);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("User Created : "+userCreated);   
	}
}