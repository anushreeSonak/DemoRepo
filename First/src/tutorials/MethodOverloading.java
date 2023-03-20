package tutorials;

public class MethodOverloading
{

	public int Multiply(int X, int Y)
	{
		return(X*Y);
	}


	public int Multiply(int X, int Y, int Z)
	{
		return(X*Y*Z);
	}


	public double Multiply(double X, double Y)
	{
		return(X*Y);
	}


	public static void main(String args[])
	{
		MethodOverloading MO= new MethodOverloading();
		System.out.println(MO.Multiply(10, 50));
		System.out.println(MO.Multiply(10, 50,20));
		System.out.println(MO.Multiply(2.5, 5.0));



	}
}



