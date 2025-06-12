package iotopic.byteorientedway;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class TestFileReadApp2 {
	
	public static void main(String[] args) {
		StringBuilder finalString = new StringBuilder();
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\ocjp\\records.txt");
			
			int temp;
			
			while ((temp = fin.read()) != -1) {
				finalString.append((char)temp);
			}
			
			fin.close();
			

		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final string: "+finalString);
	}

}
