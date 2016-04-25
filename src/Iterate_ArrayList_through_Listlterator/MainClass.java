package Iterate_ArrayList_through_Listlterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//we have to traverse first in forward direction to use hasPrevious() and previous() methods;

public class MainClass 
{
	public static void main(String[] args)
	{
		ArrayList treeSet = new ArrayList<>();
		
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		
		ListIterator<Integer> iterator = treeSet.listIterator();
		
		while(iterator.hasNext())
		{
			System.out.println("" + iterator.next());
		}
		
		
		
		
		while(iterator.hasPrevious())
		{
			System.out.println("" + iterator.previous());
		}
	}
}
