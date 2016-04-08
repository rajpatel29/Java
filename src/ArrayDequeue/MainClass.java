package ArrayDequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

//1.	ArrayDeque implements Deque interface and ArrayDeque are available from jdk1.6. 
//2.	Deque is that queue which allows insert and remove of elements from both sides. 
//3.	ArrayDeque is not thread safe. ArrayDeque allows unlimited insertion of elements. 
//4.	ArrayDeque can be used as queue and stack both. When it is used as stack, it is faster than stack and when it is used as queue, it is faster than linkedlist.
//5.	Iterator object of ArrayDeque allows removal and modification of ArrayDeque elements. 

public class MainClass 
{
	public static void main(String[] args) 
	{
		ArrayDeque<String> deque = new ArrayDeque<>();
		
		deque.offerFirst("1");
		
		deque.add("A");
		deque.add("B");
		deque.add("C");
		
		deque.offerLast("2");
		
		deque.addLast("4");
		
		
		Iterator<String> iterator = deque.iterator();
		System.out.println("First time");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("Second time ");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
}
