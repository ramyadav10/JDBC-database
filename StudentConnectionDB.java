package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentConnectionDB {
	
	static Connection con;
	public static Connection createCP() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user= root & password = 123456");
		return con;
	}
}