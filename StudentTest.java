import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Public tests for Ex2.
 * @author Dhanish Ashraf
 */

public class StudentTest {

	private Student s1;
	
	@Before /** Here we initialize the class and create a new student 
	called Dhanish along with DOB, student ID and degree programe. */
	
	public void setUp() 
	{
		s1 = new Student("Dhanish", "17 May 1995", "1336289", "MSc Computer Science");
	}
	
	@Test /** Here we define the first test. We check the values of Name,
	Student ID and degree programme	are all correct via the getters. 
	We give each assertEquals an error message, describing why it failed, 
	to display if necessary.
	*/
	public void testAll() {

		assertEquals("Failure in testAll:" + "expected name not equal to given name.", 
				"Dhanish",s1.getName()); // The error message followed by expected string followed by actual string.
		assertEquals("Failure in testAll:" + "expected student ID not equal to given student ID.", 
				 "1336289",s1.getStudentID()); // The error message followed by expected string followed by actual string.
		assertEquals("Failure in testAll:" + "expected degree programme not equal to given degree programme.", 
				"MSc Computer Science",s1.getDegreeProgramme()); // The error message followed by expected string followed by actual string.
	}

	@Test /** Here we define the second test. We check the value of the 
	date of birth is correct via the getter. We give the assertEquals 
	an error message, describing why it failed, to display if necessary.
	*/
	public void testDOB() {
		
		assertEquals("Failure in testDOB:" + "expected Date of Birth not equal to given Date of Birth.", 
					"17 May 1995",s1.getDateOfBirth());	
		// The error message followed by expected string followed by actual string.
	}
	
	@Test /** Here we define the third test. We check the toString displays correctly.
	We give the assertEquals an error message, describing why it failed, to display if necessary.
	*/
	public void testToString() {
		
		String expected = "[Dhanish, 17 May 1995, ID: 1336289, MSc Computer Science]";
		assertEquals("Failure in testToString:" + "expected Date of Birth not equal to given Date of Birth.",
				expected, s1.toString());
		// The error message followed by expected string followed by actual string.
	}

}

