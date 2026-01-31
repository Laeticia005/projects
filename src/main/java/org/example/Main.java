package org.example;

import java.sql.Connection;
public class Main {
    public static void main(String[] args) {

        StudentDao dao = new StudentDao();

        try (Connection con = Db.getConnection()) {
            System.out.println("Connected ");

            dao.insertStudent(con,
                    "Laeticia Mallat",
                    "laeticia3@test.com");

            dao.listStudents(con);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

