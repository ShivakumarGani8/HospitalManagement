package com.hospital;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddDepartment")
public class DepartmentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
    	System.out.println("Department class");
        String departmentName = request.getParameter("department_name");
        String departmentDescription = request.getParameter("department_description");
        int noOfDoctors = Integer.parseInt(request.getParameter("no_of_doctors"));
        int generalRooms = Integer.parseInt(request.getParameter("general_rooms"));
        int acRooms = Integer.parseInt(request.getParameter("ac_rooms"));
        int nonAcRooms = Integer.parseInt(request.getParameter("non_ac_rooms"));
        int icu = Integer.parseInt(request.getParameter("icu"));
        double costGeneralRoom = Double.parseDouble(request.getParameter("cost_general_room"));
        double costAcRoom = Double.parseDouble(request.getParameter("cost_ac_room"));
        double costNonAcRoom = Double.parseDouble(request.getParameter("cost_non_ac_room"));
        double costIcu = Double.parseDouble(request.getParameter("cost_icu"));
        
        
//        response.sendRedirect("success.html"); // Change to your success page
    }
}

