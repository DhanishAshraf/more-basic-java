
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**Public tests for Ex5.
 * @author Dhanish Ashraf
 */

public class FractionTest {

	private Fraction f1, f2;

	@Before // Here we initialize the class by setting the inital fractions.
	public void setUp() {
		f1 = new Fraction(2, 6);
		f2 = new Fraction(3, 8);
	}

	@Test // Here we test the getters and the toString.
	public void test1() {

		assertEquals(2, f1.getNumerator());
		assertEquals(6, f1.getDenominator());
		assertEquals("2/6", f1.toString());
	}

	@Test //Here we test the sum function.
	public void testSum() {

		// expected fraction when f1 and f2 are summed
		Fraction expected = new Fraction(34, 48);
		
		Fraction actual = f1.add(f2);
		
		assertEquals(expected.getNumerator(), actual.getNumerator());
		assertEquals(expected.getDenominator(), actual.getDenominator());
		assertEquals(expected.toString(), actual.toString());
	}

	@Test //Here we test the multiply function.
	public void testMultiply() {

		// expected fraction when f1 and f2 are multiplied
		Fraction expected = new Fraction(6, 48);

		Fraction actual = f1.multiply(f2);

		assertEquals(expected.getNumerator(), actual.getNumerator());
		assertEquals(expected.getDenominator(), actual.getDenominator());
		assertEquals(expected.toString(), actual.toString());
	}

	@Test // Here we test the boolean function
	public void testBoolean() {
		
		assertTrue(f1.less(f2));
		assertFalse(f2.less(f1));

		assertTrue(f1.multiply(f2).less(f1.add(f2)));
	}

}
