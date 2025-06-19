package iotopic.byteorientedway.serializabletopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestFileObjectReadApp2 {
	
	public static void main(String[] args) {
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\ocjp\\studentRecords.txt");
			
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Student s = (Student)oin.readObject();
			
			System.out.println("Roll no: "+s.getRno()+"\n"+"Name: "+s.getName()+"\n"+"Std: "+s.getStd());
			oin.close();
			fin.close();
			
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
