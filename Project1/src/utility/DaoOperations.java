package utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import p1.Student;

public class DaoOperations {

	public boolean register(Student student){
		boolean a=false;
		Connection connection=ConnectionProvider.getConnection();
		String query="Insert into Student values(?,?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setInt(3, student.getAge());
			preparedStatement.setString(4, student.getPassword());
			int result=preparedStatement.executeUpdate();
			if(result>0){
				System.out.println("Registered");
				a= true;
			}
			else{
				System.out.println("Not Registered");
				a= false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
	public boolean login(String name,String password){
		boolean a=false;
		Connection connection=ConnectionProvider.getConnection();
		String query="Select * from student where name=? and password=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			int result=preparedStatement.executeUpdate();
			if(result>0){
				System.out.println("Logged Successfully");
				a= true;
			}
			else{
				System.out.println("Invalid Username or Password");
				a= false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
}
