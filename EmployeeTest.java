
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Public tests for Ex4.
 * @author Dhanish Ashraf
 */

public class EmployeeTest
{

	private Employee4 emp1;
	
	@Before /** Here we initialize the class and create a new employee 
	called Dhanish, with his hourly salary and number of hours worked */
	public void setUp() {
		emp1 = new Employee4("Dhanish", 10.4, 30 );
	}
	
	
	@Test /** Here we define the first test. We set the first name 
	to Helen, hourly salary to 20.6 and number of hours worked to 27 
	via the setters and then check the getters are all correct. 
	We give each assertEquals an error message, describing why it failed, 
	if necessary.
	*/
	public void testDetails() {
		// Here we change all the employee details
		emp1.setName("Helen");
		emp1.setHourlySalary(20.6);
		emp1.setNumberOfHours(27);
		
		assertEquals( "Failure in testDetails:" + "expected name not equal to given first name.",
				"Helen", emp1.getName());
		assertEquals("Failure in testDetails:" + "expected hourly salary not equal to given hourly salary.",
				20.6, emp1.getHourlySalary(),0.0000001);
		assertEquals( "Failure in testDetails:" + "expected numeber of hours not equal to given hours.",
				27, emp1.getNumberOfHours());
	}

	
	@Test /** Here we define the second test. We set the hourly salary
	and number of hours and then test it gives the correct monthly salary. 
	We give the assertEquals an error message, describing why it failed, 
	if necessary.
	*/
	public void testMonthlySalary() {
	
		emp1.setHourlySalary(20.6);
		emp1.setNumberOfHours(37);
		double expected = 20.6 * 37;
		
		assertEquals( "Failure in testMonthlySalary:" + "expected monthly salary not equal to given salary.",
				expected, emp1.monthlySalary(),0.000001);
	}

	@Test /** Here we define the third test. We set the hourly salary
	and number of hours and then test it gives the correct monthly salary.
	We then set the percentage increase in salary and test it gives the correct
	increase in salary.	We give the assertEquals an error message, describing why it failed, 
	if necessary.
	*/
	public void testIncreaseSalary() {
	
		emp1.setHourlySalary(30.5);
		emp1.setNumberOfHours(52);
		
		assertEquals( "Failure in testIncreaseSalary:" + "expected monthly salary not equal to given salary.",
				1586, emp1.monthlySalary(),0.000001);
	
		emp1.increaseSalary(5.4); //Increasing the salary by 5.4%
	
		assertEquals( "Failure in testIncreaseSalary:" + "expected monthly salary not equal to given salary.",
				1671.644, emp1.monthlySalary(),0.000001);
	
	}
	@Test /** Here we define the third test. We set the hourly salary
	and number of hours and then test it gives the correct monthly salary.
	We then set the percentage increase in salary and then increase it again 
	and test it gives the correct increase in salary. We give the assertEquals 
	an error message, describing why it failed, if necessary.
	*/
	public void testIncreaseSalary2() {
	
		emp1.setHourlySalary(30.5);
		emp1.setNumberOfHours(52);
		
		emp1.increaseSalary(5.4);
		emp1.increaseSalary(10.5);
		assertEquals("Failure in testMonthlySalary2:" + "expected monthly salary not equal to given salary.", 
				1847.166619, emp1.monthlySalary(),0.000001);
	
	}

}
