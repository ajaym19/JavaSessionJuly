package FilehandlingDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	/*
	 * File Handling:
	 * read and write to and from file
	 * txt
	 * excel
	 * csv
	 * 
	 * read a book:
	 * 1: which book: ABC
	 * 2: where? Lib1
	 * 
	 * what will happen if the book is not present there?
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "./src/FilehandlingDemo/TestData1";
		FileReader reader = new FileReader(filePath);
		System.out.println("Hi");
		System.out.println("I have read the file");
		//System.out.println((char)reader.read());
		int i;
		while ((i = reader.read()) != -1) {
			System.out.print((char)i);
		}
		reader.close();
		
		FileWriter writer = new FileWriter(filePath);
		writer.write("Hello");
		writer.write("Hello123");
		writer.close();
		
		
		
	}
}
