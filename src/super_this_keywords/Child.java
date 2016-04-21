package super_this_keywords;

public class Child extends Parent
{
	public static int n  = 10;
	
	public Child(int x)
	{
		System.out.println("In Child's constructor with one argument");
	}

	public void callMeToo()
	{
		this.n = 90;
		System.out.println("In child class method " + this.n);
		super.callMe();
	}
}
