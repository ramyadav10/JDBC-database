package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentsDB {
	
	static Connection con;
	static Statement s;
	static PreparedStatement ps;
	public static boolean createC(Student student) throws Exception {
		boolean flag=false;
		String q="insert into world.StudentDB(FirstName,LastName)values(?,?)";
		con=StudentConnectionDB.createCP();
		ps=con.prepareStatement(q);
		ps.setString(1, student.getFirstName());
		ps.setString(2, student.getLastName());
		
		ps.executeUpdate();
		flag=true;
	return flag;
	}
	public static boolean showC() throws Exception {
		boolean flag=false;
		String q="select * from world.StudentDB";
		con=StudentConnectionDB.createCP();
		s=con.createStatement();
		ResultSet rs=s.executeQuery(q);
		while(rs.next()) {
			int id=rs.getInt(1);
			String FirstName=rs.getString(2);
			String LastName=rs.getString(3);
			System.out.println("Student_ID: "+id );
			System.out.println("Student_FirstName: "+FirstName );
			System.out.println("Student_LastName: "+LastName );
			System.out.println("+++++++++++++++++++++++++++");
		}
		
		flag=true;
	return flag;
	}
	public static boolean deleteC(String user) throws Exception {
		boolean flag=false;
		String q="delete from world.StudentDB where FirstName=?";
		con=StudentConnectionDB.createCP();
		ps=con.prepareStatement(q);
		ps.setNString(1, user);;
		
		ps.executeUpdate();
		flag=true;
	return flag;
	}
	
}
