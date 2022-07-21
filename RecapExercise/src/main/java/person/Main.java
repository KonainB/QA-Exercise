package person;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		InputAndOutput obj=new InputAndOutput();
		try {
			obj.copy("file.txt", "newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	try {
		obj.bufferedCopy();
	} catch (IOException e) {
		e.printStackTrace();
	}

}}
