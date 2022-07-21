package map_org;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		Map<Integer,String> autoMap=new HashMap();
		autoMap.put(101, "Sedan Car");
		autoMap.put(102, "Bike");
		autoMap.put(103, "Truck");
		autoMap.put(104, "Bus");
		autoMap.put(105, "Scooter");
		autoMap.put(106, "SUV");
		autoMap.put(107, "SUV");
		System.out.println(autoMap); // prints all in one line
		
//		autoMap.remove(101);
//		System.out.println(autoMap);
		
		for(Entry d:autoMap.entrySet()) //For loop to print one after the other
		{
			System.out.println(d.getKey()+"---"+d.getValue());
		}
		
		
		Set<Integer> keySet=new HashSet();
		Set<String> valueSet=new HashSet();
		
		for(Entry d:autoMap.entrySet())
		{
			keySet.add((Integer)d.getKey());
			valueSet.add((String)d.getValue());
		}
		System.out.println(keySet);
		System.out.println(valueSet);
		
		
		
		for (Integer i : autoMap.keySet()) 
		{
		    System.out.println(i);
		}
		for (String i : autoMap.values()) 
		{
		    System.out.println(i);
		}
	

	Map<String,String> items=new HashMap();
	items.put("TV", "4500, Samsung, 1");
	items.put("Mobile","1200, Apple, 1");
	items.put("Bluetooth mic","500, Digitech, 1)");
	items.put("Tripod","300, Logitech, 1");
	System.out.println(items);
	
	for(Entry x:items.entrySet()) 
	{
		System.out.println(x.getKey()+"---"+x.getValue());
	}
	
	

}
}
