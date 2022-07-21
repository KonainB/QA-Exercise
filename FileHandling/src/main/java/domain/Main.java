package domain;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		InputAndOutput obj=new InputAndOutput();
		try {
			obj.copy("x.txt", "y.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	try {
		obj.bufferedCopy();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}}
