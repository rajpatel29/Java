package Constructor;

public class Apple
{
	//	It is for initializing object
	//	It can have throws clause: we can throw exception from constructor.
	//	It should not contain Non Access Modifiers: final ,static, abstract, synchronized
	//	It can have all four accessibility modifiers: private , public, protected, default
	
	public Apple()
	{
		System.out.println("In Apple's Constructor");
		System.out.println("I am constructor");
		System.out.println();
		System.out.println();
	}
	
	//see we can create a method that has the same name as class name though it is not a good practice
	public void Apple()
	{
		System.out.println("I am not a constructor");
	}
}
