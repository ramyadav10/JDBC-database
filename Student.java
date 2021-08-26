package javaJDBC;

public class Student {
	private int studentID;
	private String firstName;
	private String lastName;
	
	public Student(Integer ID,String fName, String lName) {
		this.firstName=fName;
		this.lastName=lName;
		this.studentID=ID;
	}
	public Student(String fName, String lName) {
		this.firstName=fName;
		this.lastName=lName;
	}

	

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
