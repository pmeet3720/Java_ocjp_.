package iotopic.byteorientedway.serializabletopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestFileObjectWriteApp1 {
	
	public static void main(String[] args) {
		Student s1 = new Student(101,"Meet",12);
		
		
		try {
			FileOutputStream fout = new FileOutputStream("studentRecords.txt");
			
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s1);
			
			System.out.println("success");
			
			out.close();
			fout.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
