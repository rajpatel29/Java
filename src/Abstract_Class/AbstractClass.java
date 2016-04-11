package Abstract_Class;

//Needs to know about abstract class

//1>	Hiding the implementation  and showing the function definition to the user.
//2>	Abstract class contains abstract methods and concrete methods(normal methods)
//3>	We can define abstract class without abstract methods.
//4>	If we declare abstract method with static compiler will throw an error.
//5>	its not possible to declare abstract method with final keyword
//6>	its not possible to declare abstract method with private .
//		public, protected and default are valid.
//		static, final and private are invalid.


public abstract class AbstractClass 
{
	 abstract void abstractMethod() throws Exception;
	
	//regular method
	public void nonAbstractMethod()
	{
		System.out.println("I am regular method");
	}
}
