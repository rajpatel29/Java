package Garbage_Collection;

public class Test 
{
	private String objName;
	
	public Test(String name)
	{
		objName = name; 
	}
	
	protected void finalize()
	{
		System.out.println(objName + " is garbage collected");
	}
}
