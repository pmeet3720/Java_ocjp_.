package iotopic.byteorientedway;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class TestFileWriteApp1 {
	
	public static void main(String[] args) {
		String name;
		System.out.println("enter name: ");
		name = new java.util.Scanner(System.in).nextLine();
		
		byte[] b = name.getBytes();
		
		try {
			
			FileOutputStream fout = new FileOutputStream("records.txt");
			
			fout.write(b);
			
			
			fout.close();
			
			
			System.out.println("success");
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
