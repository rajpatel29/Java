package super_this_keywords;

public class Parent 
{
	public Parent()
	{
		System.out.println("In Parent constructor with no arguments");
	}
	
	public Parent(int i)
	{
		this();
		System.out.println("In Parent constructor with 1 arguments");
	}
	
	static void callMe()
	{
		System.out.println("In static method of parent");
	}
}
