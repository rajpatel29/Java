package Restrict_Class_from_Creating_3_Instances;

public class MainClass 
{
	public static void main(String args[])
	{
		System.out.println(SingletonClass.getInstance().hashCode());
		System.out.println(SingletonClass.getInstance().hashCode());
		System.out.println(SingletonClass.getInstance().hashCode());
		System.out.println(SingletonClass.getInstance().hashCode());
		System.out.println(SingletonClass.getInstance().hashCode());
	}
}
