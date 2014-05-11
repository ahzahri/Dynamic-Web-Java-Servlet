package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import beans.User;

public class UserDAO {

	public static User getUser(int id) {
		
		String url = "jdbc:mysql://ouaamou.com.mysql:3306/ouaamou_com";
		String username = "ouaamou_com";
		String password = "7ttrBnUR";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");	
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		User user = new User();
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			result = statement.executeQuery("SELECT id, first_name, last_name, email, phone_number FROM dw_user WHERE id = " + id);
			
			if(result.next()) {
				user.setId(result.getInt("id"));
				user.setFirstName(result.getString("first_name"));
				user.setLastName(result.getString("last_name"));
				user.setEmail(result.getString("email"));
				user.setPhoneNumber(result.getString("phone_number"));
			}
			else {
				user = null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (result != null) {
				try {
					result.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return user;
	}
	
public static ArrayList<User> getAllUsers() {
		
		String url = "jdbc:mysql://localhost:3306/ouaamou_com";
		String username = "root";
		String password = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");	
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<User> users = new ArrayList<User>();
		Connection connection = null;
		
		Statement statement = null;
		ResultSet result = null;
		
		try {
			//connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ouaamou_com:root:");
			//connection = DriverManager.getConnection("jdbc:mysql://localhost/ouaamou_com?user=root&password=");
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			result = statement.executeQuery("SELECT id, first_name, last_name, email, phone_number FROM dw_user");
			
			User user = new User();
			while(result.next()) {
				user.setId(result.getInt("id"));
				user.setFirstName(result.getString("first_name"));
				user.setLastName(result.getString("last_name"));
				user.setEmail(result.getString("email"));
				user.setPhoneNumber(result.getString("phone_number"));
				
				users.add(user);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (result != null) {
				try {
					result.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return users;
	}
}
