package com.databse;

import com.hospital.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartmentDAO {
    private static final String insertDepartment = "INSERT INTO departments (department_name, department_description, no_of_doctors, general_rooms, ac_rooms, non_ac_rooms, icu, cost_general_room, cost_ac_room, cost_non_ac_room, cost_icu) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public void addDepartment(Department department) {
        try (Connection connection = HospitalDataBase.getDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertDepartment)) {

            preparedStatement.setString(1, department.getDepartmentName());
            preparedStatement.setString(2, department.getDepartmentDescription());
            preparedStatement.setInt(3, department.getNoOfDoctors());
            preparedStatement.setInt(4, department.getGeneralRooms());
            preparedStatement.setInt(5, department.getAcRooms());
            preparedStatement.setInt(6, department.getNonAcRooms());
            preparedStatement.setInt(7, department.getIcu());
            preparedStatement.setDouble(8, department.getCostGeneralRoom());
            preparedStatement.setDouble(9, department.getCostAcRoom());
            preparedStatement.setDouble(10, department.getCostNonAcRoom());
            preparedStatement.setDouble(11, department.getCostIcu());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
