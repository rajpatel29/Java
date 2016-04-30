package Enum_2;

public class MainClass 
{
	public static void main(String args[])
	{
		for(Company cName : Company.values())
		{
			System.out.println(cName + " has value " + cName.value1 + " and " + cName.value2);
		}
	}
}
