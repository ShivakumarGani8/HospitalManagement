package com.hospital;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddPatient")
public class PatientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
    	System.out.println("Patient page");
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String dateOfBirth = request.getParameter("date_of_birth");
        String gender = request.getParameter("gender");
        String fatherOrSpouseName = request.getParameter("father_spouse_name");
        String bloodGroup = request.getParameter("blood_group");
        String contactNumber = request.getParameter("contact_number");
        boolean visitedEarlier = request.getParameter("visited_earlier") != null;
        
//        response.sendRedirect("success.html"); // Change to your success page
    }
}

