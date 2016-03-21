package Abstract_Class;

public class MainClass 
{
	public static void main(String args[])
	{
		AbstractClass obj = new AbstractClass() 
		{
			@Override
			void abstractMethod() 
			{
				System.out.println("In abstact method");
				throw new RuntimeException();
			}
		};
		
		try
		{
			obj.abstractMethod();
		}
		catch(Exception ex)
		{
			System.out.println("You got an Exception sir");
		}
	}
}
