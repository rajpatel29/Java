package Static_Class;

public class MainClass 
{
	public static void main(String args[])
	{
		// create instance of nested Static class
		OuterClass.StaticClass staticObj = new OuterClass.StaticClass();
		staticObj.callMe();
		
		// In order to create instance of Inner class we need an Outer class 
	    // instance. Let us create Outer class instance for creating 
	    // non-static nested class
		OuterClass outer = new OuterClass(); 
		OuterClass.NonStaticClass nonStatic =  outer.new  NonStaticClass(); 
		nonStatic.callMe();
		
	}
}

class OuterClass
{
	private static int staticVar = 10;
	private int nonStaticVar = 90;
	
	public static class StaticClass
	{
		void callMe()
		{
			System.out.println("In StaticClass");
			staticVar += 5;
//			we can not use non static variable here
		}
	}
	
	public class NonStaticClass
	{
		void callMe()
		{
			System.out.println("In NonStaticClass");
			
			//we can use both static and non static variable
			staticVar += 10;
			nonStaticVar += 10;
		}
	}
}