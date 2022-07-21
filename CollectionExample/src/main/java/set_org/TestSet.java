package set_org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import arraylist_org.Item;

public class TestSet {

	public static void main(String[] args) {
		Set fruits=new HashSet();
		//HashSet fruits=new HashSet();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Pineapple");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Fig");
		System.out.println(fruits);
		
		Set fruits1=new TreeSet();
		//TreeSet fruits=new TreeSet();
		fruits1.add("Apple");
		fruits1.add("Orange");
		fruits1.add("Banana");
		fruits1.add("Orange");
		fruits1.add("Pineapple");
		fruits1.add("Grapes");
		fruits1.add("Apple");
		fruits1.add("Fig");
		System.out.println(fruits1);
		
		Set item=new HashSet();
		Item one=new Item("TV",4500,"Samsung",1);
		Item two=new Item("Mobile",1200,"Apple",1);
		Item three=new Item("Bluetooth mic",500,"Digitech",1);
		Item four=new Item("Tripod",300,"Logitech",1);
		item.add(one);
		item.add(two);
		item.add(three);
		item.add(four);
		System.out.println(item);
		


	}

}
