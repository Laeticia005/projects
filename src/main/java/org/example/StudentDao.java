package org.example;

import java.sql.*;

public class StudentDao {

    public void insertStudent(Connection con,
                              String name,
                              String email) throws SQLException {

        String sql =
                "INSERT INTO student(full_name, email) VALUES (?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, email);
            ps.executeUpdate();
        }
    }
    public void listStudents(Connection con) throws SQLException {
        String sql = "SELECT id, full_name, email FROM student";

        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("full_name") + " | " +
                                rs.getString("email")
                );
            }
        }
    }
}

