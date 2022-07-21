package person;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileWriterList {
	
	public static void main(String[] args) {
		Person p1=new Person("Konain",20,"Software Engineer");
		Person p2=new Person("Ayeni",20,"System Administrator");
		Person p3=new Person("Upasana",21,"Data Analyst");
		Person p4=new Person("Marwa",22,"Web Developer");
		Person p5=new Person("Sean",23,"IT Technician");
		
		ArrayList<Person> persList=new ArrayList();
		persList.add(p1);
		persList.add(p2);
		persList.add(p3);
		persList.add(p4);
		persList.add(p5);
		
		 FileWriter writer = null;
	        try {
	               writer = new FileWriter("file.txt"); 
	            for(Person str: persList) {
	                writer.write(str + System.lineSeparator());
	            }
	            
	            writer.close();
	        } catch (IOException e) {
	                System.out.println(e.getMessage());
	        }
	    
		
	}	
}


