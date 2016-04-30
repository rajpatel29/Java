package TreeSet_Comparator;

import java.util.Comparator;

public class NameSorting implements Comparator<Employee> 
{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		return o1.getName().compareTo(o2.getName());
	}

}
