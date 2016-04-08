package OverRidding_Accessibility_Modifier;

public class MainClass 
{
	public static void main(String[] args) 
	{
		//	Can we override private methods in java?
		//	No
		
		//	Can we override static methods of super class in sub class? 
		//	No
		
		//	Can we change the return type of overridden method in sub class?
		//	No
		
		//	Can we change accessibility modifier in sub class overridden method? 
		//	Yes we can change accessibility modifier in sub class overridden method but should increase the accessibility 
		//	if we decrease compiler will throw an error message.
		
		//	default < public < protected
		
		//	super class method        Sub class method 
		//	default						default protected public
		//	protected					protected public
		//	public						public
	}
}
