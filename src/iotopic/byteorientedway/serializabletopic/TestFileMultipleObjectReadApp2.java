package iotopic.byteorientedway.serializabletopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestFileMultipleObjectReadApp2 {
	
	public static void main(String[] args) {
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\ocjp\\studentRecords1.txt");
		 
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Student[] s = (Student[])oin.readObject();
			
			for(int i=0;i<5;i++) {
				System.out.println("Roll No.: "+s[i].getRno()+"\tName: "+s[i].getName()+"\tStd: "+s[i].getStd());
			}
			
			oin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
