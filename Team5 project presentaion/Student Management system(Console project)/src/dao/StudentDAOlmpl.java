package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Student;
import util.DBUtil;

public class StudentDAOlmpl implements StudentDAO{
	@Override
	public void createStudent(Student student) {

		String SQL = "INSERT INTO student(admissionNo,studentName,email,schoolName,city,percentage)VALUES(?,?,?,?,?,?)";
		try
		{
		
			Connection connection = DBUtil.getConnection();
		
			PreparedStatement ps = connection.prepareStatement(SQL);
			ps.setInt(1,student.getAdmissionNo());
			ps.setString(2, student.getStudentName());
			ps.setString(3, student.getEmail());
			ps.setString(4, student.getSchoolName());
			ps.setString(5, student.getCity());
			ps.setDouble(6, student.getPercentage());
			
			int executeUpdate = ps.executeUpdate();
			
			if(executeUpdate ==1){
				System.out.println("Student record Saved..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Student getStudentById(int admissionNo) {
		Student student = null;
		String SQL = "SELECT *FROM student WHERE admissionNo=?";
		try
		{
		Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(SQL);
			
			ps.setInt(1, admissionNo);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int admNo = rs.getInt("admissionNo");
				String studentName = rs.getString("studentName");
				String email = rs.getString("email");
				String schoolName = rs.getString("schoolName");
				String city = rs.getString("city");
				Double percentage = rs.getDouble("percentage");


				student = new Student();
				student.setStudentName(studentName);
				student.setEmail(email);
				student.setCity(city);
				student.setSchoolName(schoolName);
				student.setPercentage(percentage);
				


			}
			else { System.out.println("Sorry given student admission number is not found"); }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return student;
	}

	public void updateStudent(Student student,int admno)
	{

	String SQL = "UPDATE student set schoolName=?,city=?,percentage=? WHERE admissionNo=?";
		try
		{
		Connection connection = DBUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(SQL);
			

			ps.setString(1, student.getSchoolName());
			ps.setString(2, student.getCity());
			ps.setDouble(3, student.getPercentage());
			ps.setInt(4,admno);
			int executeUpdate = ps.executeUpdate();
			
			if(executeUpdate ==1)
			{
				System.out.println("Student Record updated with "+student.getAdmissionNo());
			}
			else {System.out.println("Admission number is not available in our system, please check "); }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudentById(int admissionNo) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM student WHERE admissionNo=?";
		try
		{
			Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(SQL);
			
			ps.setInt(1,admissionNo);
			
			int executeUpdate = ps.executeUpdate();
			
			if(executeUpdate ==1){
				System.out.println("Student record deleted with :"+admissionNo);
			}
			else { System.out.println("Given Admission number is not available in our system"); }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> getAllStudentsInfo() {
		List<Student> studentList = new ArrayList<>();
		String SQL = "SELECT *FROM student";
		try
		{
			Connection connection = DBUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(SQL);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int admNo = rs.getInt("admissionNo");
				String studentName = rs.getString("studentName");
				String email = rs.getString("email");
				String schoolName = rs.getString("schoolName");
				String city = rs.getString("city");
				
				Double percentage = rs.getDouble("percentage");
		
				Student student = new Student();
				student.setAdmissionNo(admNo);
				student.setStudentName(studentName);
				student.setCity(city);
				student.setEmail(email);
				student.setSchoolName(schoolName);
				student.setPercentage(percentage);


				studentList.add(student);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return studentList;
		}

}
