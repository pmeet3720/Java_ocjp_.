package iotopic.byteorientedway.serializabletopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestFileMultipleObjWriteApp1 {
	
	public static void main(String[] args) {
		Student s[] = new Student[5];
		
		for(int i=0;i<5;i++) {
			s[i] = new Student();
			System.out.println("enter s["+i+"]: ");
			s[i].scanData();
		}
		
		try {
			FileOutputStream fout = new FileOutputStream("studentRecords1.txt");
			
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s);
			
			out.close();
			fout.close();
			
			System.out.println("success");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
