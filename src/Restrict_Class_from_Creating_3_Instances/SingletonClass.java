package Restrict_Class_from_Creating_3_Instances;

public class SingletonClass 
{
	private static SingletonClass singletonClassObject;
	private static int counter = 0;
	
	private SingletonClass()
	{
		System.out.println("In Constructor " + counter );
		counter++;
	}
	
	public static SingletonClass getInstance()
	{
		if(counter < 3)
		{
			singletonClassObject = new SingletonClass();
		}
		
		return singletonClassObject;
	}
	
}
