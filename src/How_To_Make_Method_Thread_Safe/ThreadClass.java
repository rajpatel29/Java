package How_To_Make_Method_Thread_Safe;

public class ThreadClass implements Runnable
{
	private String threadName;
	private Thread t;
	
	public ThreadClass(String name) 
	{
		threadName = name ;
	}
	
	
	public void start()
	{
		System.out.println("Strarting "  +  threadName);
		
		if(t == null)
		{
			t = new Thread(this , threadName);
			t.start();
		}
	}

	@Override
	public void run() 
	{
		Method.callMe(threadName);
	}
	

}
