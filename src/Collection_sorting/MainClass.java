package Collection_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainClass
{
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(23);
		list.add(11);
		list.add(10);
		
		
		//to sort the collection
		Collections.sort(list);

		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println();
		System.out.println();
		
		//To check whether there is an element or not If so then find the index number
		boolean isThere = list.contains(23);
		
		if(isThere)
		{
			System.out.println("Index : " + list.indexOf(23));
		}
		else
		{
			System.out.println("It is not there");
		}
		
		
//		to remove an element
//		list.remove(1);
	}
}
