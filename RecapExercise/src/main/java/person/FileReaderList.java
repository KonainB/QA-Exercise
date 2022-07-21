package person;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderList {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("file.txt");
			int data = fr.read();
			while (data != -1)
			{
				System.out.print((char) data);
				data = fr.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
