package iotopic.byteorientedway;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class TestApp3 {
	
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\ocjp\\src\\iotopic\\byteorientedway\\TestFileReadApp2.java");
			
			FileOutputStream fout = new FileOutputStream("TestApp2Clone.java");
			int temp;
			
			while((temp = fin.read()) != -1) {
				System.out.print((char)temp);
				fout.write(temp);
			}
			
			fout.close();
			fin.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
