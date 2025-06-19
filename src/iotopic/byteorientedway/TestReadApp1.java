package iotopic.byteorientedway;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestReadApp1 {
	
	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fout = new FileOutputStream("TestWriteApp2.java");
			
			FileInputStream fin = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\ocjp\\src\\iotopic\\fileclass\\TestFileApp1.java");
			int tmp;
			
			while((tmp = fin.read())!=-1) {
				System.out.print((char)tmp);
				fout.write(tmp);
			}
			
			fout.close();
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
