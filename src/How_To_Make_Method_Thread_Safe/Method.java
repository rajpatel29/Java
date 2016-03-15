package How_To_Make_Method_Thread_Safe;

public class Method 
{
	public static synchronized void callMe(String threadName)
	{
		for (int i = 0; i < 30 ; i++) 
		{
			System.out.println(threadName + " : " + i );
		}
	}
}
