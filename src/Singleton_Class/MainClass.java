package Singleton_Class;

public class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("In main class");
		MySingltonClass obj = MySingltonClass.getInstance();
		obj.test();
	}
}

class MySingltonClass
{
	private static MySingltonClass singleton;
	
	static
	{
		System.out.println("In static block");
		singleton = new MySingltonClass();
	}
	
	private MySingltonClass()
	{
	}
	
	public static  MySingltonClass getInstance()
	{
		return singleton;
	}
	
	public static void test()
	{
		System.out.println("It is working");
	}
}
