package tutorials;

public class TryCatch 
{
	static void checkAge(int age) 
	{  
		//If age is less than 18 it will throw an exception
		
		if (age < 18) 
		{
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		}
		else 
		{
			//if age is greater than 18 it will print below statement
			System.out.println("Access granted - You are old enough!");
		}
	}

	public static void main(String[] args) 
	{
		checkAge(15); // Set age to 15 (which is below 18...)
	}
}