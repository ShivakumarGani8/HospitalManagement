package com.databse;
import com.hospital.Doctor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoctorDAO {
    private static final String insertDoctor = "INSERT INTO doctors (first_name, middle_name, last_name, registration_no, date_of_birth, gender, email, specialization, qualification, contact_number, address, visiting_time, visiting_days, no_of_patients_per_day, department_no) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public void addDoctor(Doctor doctor) {
        try (
        	Connection connection = HospitalDataBase.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insertDoctor)) {
            preparedStatement.setString(1, doctor.getFirstName());
            preparedStatement.setString(2, doctor.getMiddleName());
            preparedStatement.setString(3, doctor.getLastName());
            preparedStatement.setString(4, doctor.getRegistrationNo());
            preparedStatement.setString(5, doctor.getDateOfBirth());
            preparedStatement.setString(6, doctor.getGender());
            preparedStatement.setString(7, doctor.getEmail());
            preparedStatement.setString(8, doctor.getSpecialization());
            preparedStatement.setString(9, doctor.getQualification());
            preparedStatement.setString(10, doctor.getContactNumber());
            preparedStatement.setString(11, doctor.getAddress());
            preparedStatement.setString(12, doctor.getVisitingTime());
            preparedStatement.setString(13, String.join(",", doctor.getVisitingDays()));
            preparedStatement.setInt(14, doctor.getNoOfPatientsPerDay());
            preparedStatement.setInt(15, doctor.getDepartmentNo());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
