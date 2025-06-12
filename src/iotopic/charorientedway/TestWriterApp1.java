package iotopic.charorientedway;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriterApp1 {
	
	public static void main(String[] args) {
		
		String name;
		System.out.println("enter name: ");
		name = new java.util.Scanner(System.in).nextLine();	
		
		try {
			FileWriter fr = new FileWriter("royal.txt");
			
			fr.write(name);
			
			fr.close();
			
			System.out.println("Success");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
