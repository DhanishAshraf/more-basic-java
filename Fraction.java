
/** Fraction is a class that multiplies and adds given fractions
 * as well as assess whether one fraction is less than another.
	@author Dhanish Ashraf dxa390
	@version 09-10-2016 
*/

public class Fraction 
{	
	// Class instance variables.
	private int numerator;
	private int denominator;
	
	// Setting the constructor.
	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	// Accessor methods to get the Numerator and the Denominator respectively.
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	// Defining how to print the objects of the class. 
	public String toString()
	{
		return getNumerator() + "/" + getDenominator();
	}
	
	/** Defining the addition and multiplication methods for the class. We do this by creating
	 * a new fraction for each in order to avoid any return type errors (converting from int to 
	 * Fraction.
	 */
	public Fraction add(Fraction summand)
	{ Fraction a = new Fraction(((this.getNumerator() * summand.getDenominator()) + 
				(this.getDenominator() * summand.getNumerator())), (this.getDenominator() * summand.getDenominator()));
	return a;
	}
	
	public Fraction multiply(Fraction factor)
	{
		Fraction a = new Fraction((this.getNumerator() * factor.getNumerator()), 
				(this.getDenominator() * factor.getDenominator()));
		return a;
	}
	
	// Defining a boolean method that will check if one fraction is less than a second fraction.
	public boolean less(Fraction comp)
	{
		float a = this.getNumerator()*1.0f/this.getDenominator();
		float b = comp.getNumerator()*1.0f/this.getDenominator();
		return a < b;
		
			
	}
}
