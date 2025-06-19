package iotopic.fileclass;

import java.io.File;
import java.io.IOException;
public class TestFileApp1 {
	
	public static void main(String[] args) throws IOException {
		File file = new File("fasttrack");
		
		System.out.println("file.exists(): "+file.exists());
		
		file.mkdir();
		
		System.out.println("file.exists(): "+file.exists());
		
		String absolutePath = file.getAbsolutePath();
		
		System.out.println(absolutePath);
		
		File f1 = new File("fasttrack","test1.txt");
		
		System.out.println("f1.exists(): "+f1.exists());
		
		if(f1.createNewFile()) {
			System.out.println("first file created: "+f1.getName());
		}
		
		File f2 = new File("fasttrack","test2.txt");
		
		if(f2.createNewFile()) {
			System.out.println("first file created: "+f2.getName());
		}
		
		File f3 = new File("fasttrack","test3.txt");
		
		if(f3.createNewFile()) {
			System.out.println("first file created: "+f3.getName());
		}
		
		File[] listofFile = file.listFiles();
		
		for(File f: listofFile) {
			System.out.println(f.getName());
		}
		
		System.out.println("Number of files: "+listofFile.length);
	}

}
