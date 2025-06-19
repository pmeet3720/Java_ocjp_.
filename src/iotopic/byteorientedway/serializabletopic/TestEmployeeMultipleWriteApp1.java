package iotopic.byteorientedway.serializabletopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployeeMultipleWriteApp1 {
	
	public static void main(String[] args) {
		Employee[] e = new Employee[3];
		
		for(int i=0;i<3;i++) {
			e[i] = new Employee();
			System.out.println("Enter details for: e["+i+"]");
			e[i].scanData();
		}
		
		try {
			FileOutputStream fout = new FileOutputStream("EmployeeRecords.txt");
			
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(e);
			
			out.close();
			fout.close();
			
			System.out.println("success");
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
