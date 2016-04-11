package Constructor;

public class Banana 
{
	Apple apple1 = new Apple(); 
	
	Banana()
	{
		this(10);
		System.out.println("Constructor with no Argument ");
	} 
	
	Banana(int x)
	{
		this(20,20);
		System.out.println("Constructor with one argument");
	}
	
	Banana(int x , int y)
	{
		System.out.println("Banana Constructors");
		System.out.println("Constructor with two arguments");
	}
}


