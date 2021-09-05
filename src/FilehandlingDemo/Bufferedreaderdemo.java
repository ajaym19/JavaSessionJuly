package FilehandlingDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bufferedreaderdemo {
	static String  filePath = "./src/FilehandlingDemo/TestData";
	
	public static void main(String[] args) throws IOException {
		readFile();
	}
	
	public static void readFile() throws IOException {
		//BR cannot directly read data from file
		FileReader reader = new FileReader(filePath);
		BufferedReader br = new  BufferedReader(reader);
		//System.out.println(br.readLine());
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
	
	public static void writeFile() {
		
	}
}
