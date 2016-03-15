package DeadLock_Between_Two_Thread;

public class MainClass 
{
	private static Object Lock1  = new Object() ;
	private static Object Lock2  = new Object() ;
	
	public static void main(String args[])
	{
		ThreadDemo1 thread1 = new ThreadDemo1();
		ThreadDemo2 thread2  = new ThreadDemo2();
		thread1.start();
		thread2.start();
	}


	private static class ThreadDemo1 extends Thread
	{
		public void run()
		{
			System.out.println("In Thread 1");
			synchronized (Lock1)
			{
				System.out.println("Thread 1 holding Lock1");
				try 
				{
					Thread.sleep(10);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				System.out.println("Thread 1 is waiting for Lock 2");
				synchronized (Lock2)
				{
					System.out.println("Thread 2 holding lock 1 and 2 ");
				}
			}
		}
	}
	
	private static class ThreadDemo2 extends Thread
	{
		public void run()
		{
			System.out.println("In Thread 2");
			synchronized (Lock2)
			{
				System.out.println("Thread 2 holding Lock2");
				try
				{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					ex.printStackTrace();
				}
				System.out.println("Thread 2 is waiting for Lock1");
				synchronized (Lock1)
				{
					System.out.println("Thread 2 holding Lock2 and Lock1");
				}
			}
		}
	}
	
}
