public class FactorialTest
{
	public static void main(String[] args)
	{
		System.out.println("factorial test");
		int n; 
		int i; 
		long result; 
		for(i = 0; i<=10;i++) 
		{
			result = factorial(i);
			System.out.println(result);
		}
	}
	
	static long factorial(int n)
	{
		int i; 
		long result = 1; 
		for(i = 1; i<=n; i++)
		{
			result *= i; 
		}
		return result; 
	}
}