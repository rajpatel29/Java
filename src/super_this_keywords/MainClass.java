package super_this_keywords;

//		What are the uses of this keyword in constructor?
//	-	It must used explicitly if non-static variable and local variable name is same.
//	-	Used to invoke current class constructor:

//		Is it possible to assign reference to this ?
//	-	No we can not assign any value to "this" because its always points to current object and it is a final reference in java.

//		Can we return this from a method?
//	-	Yes

//		Can we use this to refer static members?
//	-	Yes

//		Is it possible to use this in static blocks? 
//	-	No

//		Can we use this in static methods?
//	-	No

//		What are all the differences between this and super keyword?
//	-	Using this we can access all current class methods and variables. Using super we can access super class variable and methods from sub class.


public class MainClass
{
	public static void main(String args[])
	{
		Child obj = new Child(4);
		obj.callMeToo();
	}
}
