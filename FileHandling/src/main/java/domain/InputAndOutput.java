package domain;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputAndOutput {
	public void copy(String inFile, String outFile) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("x.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("y.txt");) {
            int numberOfBytesRead;
            byte[] bytesArray = new byte[128];
            while ((numberOfBytesRead = fileInputStream.read(bytesArray)) != -1) {
                fileOutputStream.write(bytesArray, 0, numberOfBytesRead);
            }
        }
    }


	public void bufferedCopy() throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("x.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("y.txt"));) {
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line + "\n");
			}
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}
}	

