package TreeSet_Comparable;

import java.util.Iterator;
import java.util.TreeSet;

//						Comparable							//Comparator
//Package				java.lang.Comparable				java.util.Comparator
//Sorting logic			Must be in Same class				Separate class
//Method definition		public int compareTo(Object obj)	public int compare(Object obj1, Object obj2)
//Method call			Collections.sort(list)				Collections.sort(list, new OtherSortClass())
//Purpose				Natural Sorting						Custom Sorting



public class MainClass 
{
	public static void main(String args[])
	{
		TreeSet<Employee> treeSet = new TreeSet<>();
		
		treeSet.add(new Employee(13 , "aaa"));
		treeSet.add(new Employee(61 , "r"));
		treeSet.add(new Employee(91 , "f"));
		treeSet.add(new Employee(10 , "v"));
		treeSet.add(new Employee(11 , "mm"));
		
		Iterator iterator = treeSet.iterator();
		while(iterator.hasNext())
		{
			Employee temp = (Employee)iterator.next();
			System.out.println(temp.getId() + " : " + temp.getName());
		}
		
		
	}
}
