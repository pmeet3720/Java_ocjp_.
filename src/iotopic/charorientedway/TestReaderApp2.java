package iotopic.charorientedway;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReaderApp2 {
	
	public static void main(String[] args) {
		try {
			FileReader frin = new FileReader("C:\\Users\\ASUS\\eclipse-workspace\\ocjp\\royal.txt");
			
			int temp;
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
