package return_in_try_catch;

public class MainClass 
{
	public static void main(String args[])
	{
		System.out.println("result of check method " + check());
	}
	
	//basic fund is if it catches exception or does not catch exception. It should reach to return statement
	public static int check()
	{
		try
		{
			System.out.println("In try");
//			int x = 10/2;
			return 10;
		}
		catch(Exception ex)
		{
			System.out.println("In catch");
			
		}
		finally
		{
			System.out.println("in finally");
		}
		return 14;
	}
}
