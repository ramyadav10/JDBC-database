package javaJDBC;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Student Database");
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1: Add New Entry ");
			System.out.println("Enter 2: Delete Entry ");
			System.out.println("Enter 3: Show Database ");
			System.out.println("Enter 4: Exit ");
			int input=sc.nextInt();
			if (input == 1 ) {
				//Add
				System.out.println("Enter First Name of Student: ");
				String fName=sc.next();
				
				System.out.println("Enter Last Name of Student: ");
				String lName=sc.next();
				
				Student student=new Student(fName,lName);
				boolean insertData=StudentsDB.createC(student);

				if (insertData) {
					System.out.println("Student is Added Sucessfully");
				}else {System.out.println("Error");}
				
				
			}else if(input == 2) {
				//Delete
				System.out.println("Enter User ID to delete:");
				String user=sc.next();
				boolean deleteData=StudentsDB.deleteC(user);
				if (deleteData) {
					System.out.println("Student data is Deleted");
				}else {System.out.println("Error");}
			}else if(input == 3) {
				//Show DataBase
				boolean showData=StudentsDB.showC();
				if (showData) {
					System.out.println("Student is shown");
				}else {System.out.println("Error");}
			}else {break;}
		}
		System.out.println("Thank you...!");
	}

}
