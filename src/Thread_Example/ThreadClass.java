package Thread_Example;

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
		
		//If you dont write this then if you call start method twice then this will execute twice
		if(t == null)
		{
			t = new Thread(this , threadName);
			t.start();
		}
	}

	@Override
	public void run() 
	{
		for (int i = 0; i < 30 ; i++) 
		{
			System.out.println(threadName + " : " + i );
		}
	}
}
