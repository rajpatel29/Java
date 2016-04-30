package Enum;

public class EnumTest
{
	Days day;
	
	public EnumTest(Days day)
	{
		this.day = day;
	}
	
	public void Test()
	{
		switch (day) 
		{
			case MONDAY:
					System.out.println("This is MONDAY");
				break;
			
			case TUESDAY:
				System.out.println("This is TUESDAY");
			break;
			
			case WEDNESDAY:
				System.out.println("This is WEDNESDAY");
			break;
			
			case THURSDAY:
				System.out.println("This is THURSDAY");
			break;
			
			case FRIDAY:
				System.out.println("This is FRIDAY");
			break;
			
			case SATURDAY:
				System.out.println("This is SATURDAY");
			break;
			
			case SUNDAY:
				System.out.println("This is SUNDAY");
			break;
	
		}
	}
}
