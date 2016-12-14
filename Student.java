/** Student is a class that keeps track of student details at a University.
 * @author Dhanish Ashraf dxa390
 * @version 08-10-2016
 */

public class Student 
{
	// The private instance variables of the class
	private String name;
	private String dateOfBirth;
	private String studentID;
	private String degreeProgramme;

	// A constructor for the class Student
	public Student(String name, String dateOfBirth, String studentID, String degreeProgramme)
	{
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.studentID = studentID;
		this.degreeProgramme = degreeProgramme;
	}
	
	// Accessor methods to get the student data
	
	public String getName()
	{
		return name;
	}
	
	public String getDateOfBirth()
	{
		return dateOfBirth;
	}
	
	public String getStudentID()
	{
		return studentID;
	}
	
	public String getDegreeProgramme()
	{
		return degreeProgramme;
	}
	
	// toString defines how to print the objects of the class.
	public String toString()
	{
		return "[" + name +", " + dateOfBirth +", ID: " + studentID + ", " + degreeProgramme + "]";
	}
}

