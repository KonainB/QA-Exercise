package arraylist_org;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList myList=new ArrayList();
		myList.add("Upasana");//String
		myList.add(1234);//Integer
		myList.add(true);//Boolean
		myList.add(30.56);//Double
		System.out.println(myList);
		
		ArrayList<Integer> myNum=new ArrayList();
		myNum.add(1000);myNum.add(2000);
		myNum.add(3000);myNum.add(4000);
		System.out.println(myNum);
		
		ArrayList<Item> itemList=new ArrayList<Item>();
		Item one=new Item("TV",4500,"Samsung",1);
		Item two=new Item("Mobile",1200,"Apple",1);
		Item three=new Item("Bluetooth mic",500,"Digitech",1);
		Item four=new Item("Tripod",300,"Logitech",1);
		
		itemList.add(one);
		itemList.add(two);
		itemList.add(three);
		itemList.add(four);
		System.out.println(itemList);
	}

}
