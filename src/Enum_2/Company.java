package Enum_2;

public enum Company 
{
	NORTH(11 , 55), SOUTH(22 , 66), EAST(33 , 77), WEST(44 , 88);
	
	public int value1;
	public int value2;
	
	private Company(int value1 , int value2)
	{
		this.value1 = value1;
		this.value2 = value2;
	}
}
