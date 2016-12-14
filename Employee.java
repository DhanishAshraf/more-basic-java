
/** Employee is a class that keeps track of the employee names, hourly salary
 * and number of hours, 
	@author Dhanish Ashraf dxa390
	@version 09-10-2016 
*/

public class Employee {
	// These are the instance variables of the class
	private String name;
	private double hourlySalary;
	private int numberOfHours;
	
	// Here we write the constructor for the class with parameters name, hourlySalary and number.
	public Employee4(String name, double hourlySalary, int numberOfHours)
	{
		this.name = name;
		this.hourlySalary = hourlySalary;
		this.numberOfHours = numberOfHours;
	}
	
	// Here we write the accessor methods (getters) which will get the relevant information.
	public String getName() // This will return the name of the employee as a string.
	{
		return name;
	}
	
	public double getHourlySalary() // This will return the employees hourly salary as a double type.
	{
		return hourlySalary;
	}
	
	public int getNumberOfHours() // This will return the number of hours the employee works as an integer.
	{
		return numberOfHours;
	}
	
	// Here we use the toString to define how to print an Employees information.
	public String toString()
	{
		return "Employee name: " + name + " Hourly Salary: " + hourlySalary +
				" Number of hours worked: " + numberOfHours;
	}
	
	// Here we write the setters to set the Employees information.
	
	public void setName(String name) // Sets the name of the employee.
	{
		this.name = name;
	}
	
	public void setHourlySalary(double hourlySalary) // Sets the employees hourly salary.
	{
		this.hourlySalary = hourlySalary;
	}
	
	public void setNumberOfHours(int numberOfHours) // Sets the number of hours worked by the employee.
	{
		this.numberOfHours = numberOfHours;
	}
	
	// The method monthlySalary will return the amount the employee earns each month.
	public double monthlySalary()
	{
		return (getHourlySalary() * getNumberOfHours());
	}
	
	// This method will increase the employees hourly salary by a specific percentage.
	public void increaseSalary(double percentage)
	{
		setHourlySalary(getHourlySalary() * ((percentage/100) + 1));
	}
	
}

