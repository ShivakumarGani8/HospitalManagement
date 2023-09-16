package com.databse;

import com.hospital.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientDAO {

    private static final String insertPatient = "INSERT INTO patients (first_name, last_name, date_of_birth, gender, father_spouse_name, blood_group, contact_number, visited_earlier) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    public void addPatient(Patient patient) {
        try (Connection connection = HospitalDataBase.getDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertPatient)) {
            preparedStatement.setString(1, patient.getFirstName());
            preparedStatement.setString(2, patient.getLastName());
            preparedStatement.setString(3, patient.getDateOfBirth());
            preparedStatement.setString(4, patient.getGender());
            preparedStatement.setString(5, patient.getFatherOrSpouseName());
            preparedStatement.setString(6, patient.getBloodGroup());
            preparedStatement.setString(7, patient.getContactNumber());
            preparedStatement.setBoolean(8, patient.isVisitedEarlier());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

