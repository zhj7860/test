public class MyException 
{
	public static void main(String [] args)
	{
		try{
			System.out.println(args[0]);
			int i = 0; 
			int n = 1;  
			//int result = n / i; 
		}
		catch (Exception e) 
		{
			System.out.println("out of bound"); 
		}
		catch (ArithmeticException ae) 
		{
			System.out.println("devide zero error"); 
		}
	}	
}

