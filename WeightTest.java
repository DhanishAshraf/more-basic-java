
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**Public tests for Ex3.
 * @author Dhanish Ashraf
 */

public class WeightTest {

	private Weight w1, w2;

	@Before /** Here we initialize the class and create two new weights 
	to convert and test */
	
	public void setUp() {
		w1 = new Weight(4.52);
		w2 = new Weight(3.94);
	}

	@Test /** Here we define the first test. We check the value of w1
	is correct in kilograms via the getters. 
	We give the assertEquals an error message, describing why it failed, 
	to display if necessary.
	*/
	public void testKG() {
		// expected weight in kilograms (for w1)
		double expected = 4.52;

		assertEquals("Failure in testKG:" + "expected weight in kilograms not equal to given weight.", 
				expected, w1.getKilograms(), 0.00000001);
	}

	@Test
	public void testPounds() {
		// expected weight in pounds (for w2)
		double expected = 8.686213;

		assertEquals("Failure in testPounds:" + "expected weight in pounds not equal to given weight.", 
				expected, w2.getPounds(), 0.000001);
	}

	@Test
	public void testOunces1() {

		// expected weight in ounces (for w1)
		double expected = 159.4383;
		
		assertEquals("Failure in testOunces1:" + "expected weight in ounces not equal to given weight.", 
				expected, w1.getOunces(), 0.0001);
	}

	@Test
	public void testOunces2() {

		// expected weight in ounces (for w2)
		double expected = 138.9794;
		
		assertEquals("Failure in testOunces2:" + "expected weight in ounces not equal to given weight."
				,expected, w2.getOunces(),  0.0001);
	}

}
