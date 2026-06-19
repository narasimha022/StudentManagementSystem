package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;

import database.DBConnection;
import model.Student;
public class StudentDAO {
	 public void addStudent(Student student) {

	        try {

	            Connection con =
	                    DBConnection.getConnection();

	            String sql =
	                    "INSERT INTO students(name, age, course) VALUES(?,?,?)";

	            PreparedStatement ps =
	                    con.prepareStatement(sql);

	            ps.setString(1, student.getName());
	            ps.setInt(2, student.getAge());
	            ps.setString(3, student.getCourse());

	            ps.executeUpdate();

	            System.out.println("Student Added Successfully");

	        } catch (Exception e) {

	            e.printStackTrace();
	        }
	    }
	}


