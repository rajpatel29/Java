package TreeSet_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class MainClass 
{
	public static void main(String[] args) 
	{
	ArrayList<Employee> list = new ArrayList<>();
		
	list.add(new Employee(37 , "xy"));
	list.add(new Employee( 46 ,"abc"));
	list.add(new Employee( 38 , "aai"));
	list.add(new Employee( 38 , "adi"));
		
		
		Collections.sort(list, new NameSorting());
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext())
		{
			Employee temp = (Employee)iterator.next();
			System.out.println(temp.getId() + " : " + temp.getName());
		}
	}
}
