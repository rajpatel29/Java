package Sort_Map_by_Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass
{
	public static void main(String args[])
	{
		Map<String, Integer> map = new HashMap<>();
		map.put("1", 12);
		map.put("2", 2);
		map.put("3", 23);
		map.put("4", 15);
		map.put("5", 100);
		map.put("6", 78);
		
		System.out.println("Map : " + map);
		
		Set<Entry<String, Integer>> set = map.entrySet();
		System.out.println("Set : " + set);
		List<Entry<String, Integer>> list = new ArrayList<>(set);
		System.out.println("List : " + list);
		
		Collections.sort(list , new Comparator<Entry<String, Integer>>() 
		{
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) 
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		
		for(Map.Entry<String, Integer> entry : list)
		{
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		
		
	}
}
