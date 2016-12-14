
/** Weight is a class that converts masses in ounces and pounds to kilograms.
 * @author Dhanish Ashraf dxa390
 * @version 09-10-2016
 */

public class Weight {
	
	// Private instance variables.
	private double kg;
	private double pounds;
	private double ounces;
	
	// A constructor for the Weight class to generate a weight given in kilograms.
	public Weight(double kg) 
	{
		this.kg = kg;
	}
	
	// This getter will calculate the given weight (kilograms) in pounds.
	public double getPounds()
	{
		pounds = kg/0.45359237;
		return pounds;
	}
	
	// This getter will return the weight in kilograms.
	public double getKilograms()
	{
		return kg;
	}
	
	// This getter will calculate the given weight (kilograms) in ounces.
	public double getOunces()
	{
		ounces = (kg/0.45359237) * 16;
		return ounces;
	}
	
}
